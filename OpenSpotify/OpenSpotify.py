# This is a Python file that is being tested 
# to open Spotify on different operating systems.

import subprocess
import platform

def OpenSpotify(): 
    try: 
        os = platform.system()
        if os == "Windows": # Windows system
            subprocess.run(["cmd", "/c", "start", "spotify"])
            print("Windows: Spotify is now being opened!")
        elif os == "Darwin": # MacOS system
            subprocess.run(["open", "-a", "Spotify"])
            print("MacOS: Spotify is now being opened!")
        elif os == "Linux": # Linux system
            subprocess.run(["spotify"])
            print("Linux: Spotify is now being opened!")
        else: # Unsupported system
            print("Operating system is not supported") 
            return False
    except Exception as e:
        print(f"Error: {e}")
OpenSpotify() 