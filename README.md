# dev-container-groovy

## TL;DR
Groovy DecvContainer with groovy 4.0 and jdk 11. 

Based on the [official groovy docker images](https://hub.docker.com/_/groovy/)
 "ms-vscode-remote.vscode-remote-extensionpack"

## Prerequisits

* A not too old copy of [Visual Studio Code](https://code.visualstudio.com)
* Installed [Remote Developement Extension](https://marketplace.visualstudio.com/items?itemName=ms-vscode-remote.vscode-remote-extensionpack)

## Verify correctness 

To show you're ready to code a sample script is executed after the container has started. You may remove the "postStartCommand" line in `.devcontainer/devcontainer.json` once you`re satisfied.

## How to Use

Just clone this repo and use it to develop your groovy app.  
With `Remote Dev Plugin` installed you should be asked to reopen the project inside a container. If not: Open the command menu using `Shift+Cmd/Ctrl+P` and type `> Rebuild Container`.   
First execution always takes a bit longer due to the need to setup the containerized dev environment. Subsequent starts are much faster.

Verify execution of groovy scripts in dev container by running [printDevContainer.json](./printDevContainer.json)   
There a bunch of neat scripts [over here](https://gist.github.com/saltnlight5/3756240). A usefull collection of ways to read files in groovy can be found at [baeldung.com](https://www.baeldung.com/groovy-file-read)

## EditorConfig

Inspired by [ASP-Hacker.rocks](https://asp.net-hacker.rocks/2020/01/13/editorconfig.html) and slightly edited.   
> Will format entire files upon save. Be careful with applying this to a shared code base.

## Knowm Issues
1. Currently no git support from inside the dev container
