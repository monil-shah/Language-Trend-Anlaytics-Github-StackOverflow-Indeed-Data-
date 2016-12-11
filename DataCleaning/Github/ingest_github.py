#!/usr/bin/env python
import os
import json
from github import Github
from github import GithubException
from github import RateLimitExceededException

try:
        gb = Github()
        events = gb.get_user().get_events()
        events_list = []
        for event in events:
                try:
                        event_dict = {}
                        event_dict["event_id"] = event.id
                        event_dict["event_type"] = event.type
                        event_dict["created_at"] = event.created_at.strftime("%Y-%m-%dT%H:%M:%SZ")
                        # To convert back: datetime.datetime.strptime(events[].created_at.strftime("%Y-%m-%dT%H:%M:%SZ"), "%Y-%m-%dT%H:%M:%SZ")
                        event_dict["payload"] = event.payload
                        event_dict["event_repo_id"] = event.repo.id
                        event_dict["event_repo_languages"] = event.repo.get_languages()
                except GithubException:
                        pass
                else:
                        events_list.append(event_dict)
        with open('input_project_sample.json', 'w') as outfile:
                for event in events_list:
                        outfile.write(json.dumps(event) + '\n')

        os.system('hdfs dfs -put input_project_sample.json PBDAProject/project_input.json')

except RateLimitExceededException:
        print "GitHub Rate Limit Exceeded"
