#!/usr/bin/env python
import sys
import json

for line in sys.stdin:
        line.strip()
        event_dict = json.loads(line)
        if event_dict["event_repo_languages"]:
                print "%s\t%s" % (event_dict["event_id"], json.dumps(event_dict))
