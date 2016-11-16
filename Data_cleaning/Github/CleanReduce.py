#!/usr/bin/env python
import json
import sys

for line in sys.stdin:
        line = line.strip()
        event_id, event_dict = line.split('\t', 1)
        print event_dict
