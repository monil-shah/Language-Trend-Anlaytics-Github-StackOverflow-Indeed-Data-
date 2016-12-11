#!/usr/bin/env python
import sys
import json

for line in sys.stdin:
        new_event_dict = {}
        line.strip()
        event_dict = json.loads(line)
        new_event_dict["event_id"] = event_dict["id"]
        new_event_dict["event_repo_languages"] = event_dict["event_repo_languages"]
        new_event_dict["event_type"] = event_dict["type"]
        new_event_dict["created_at"] = event_dict["created_at"]
        new_event_dict["payload"] = event_dict["payload"]
        new_event_dict["event_repo_id"] = event_dict["repo"]["id"]
        new_event_dict["event_repo_name"] = event_dict["repo"]["name"]
        print "%s\t%s" % (new_event_dict["event_id"], json.dumps(new_event_dict))
