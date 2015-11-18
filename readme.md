This repo just houses and links to other projects, and is meant to be used for [the integration test](https://github.com/CANVE/extractor/tree/master/sbt-plugin-integration-test). This repo comprises:

+ Projects created specifically for integration testing.
+ Links to publicly available git projects, useful for integration testing. These are linked as [git submodules](https://git-scm.com/docs/git-submodule), rather than copied in, which comes with some conveniences and some annoyance alike. 

### Cloning:
```
git clone git@github.com:CANVE/integration-test-projects.git
git submodule update --init
```

<br>

---
<br>
##Updating linked projects to their latest
Well, say you want to run the integration test on the latest online version of the test projects, not those that you have lying around from a couple of weeks ago. This is encouraged, yet before doing that, it might make sense first running the [the integration test](https://github.com/CANVE/extractor/tree/master/sbt-plugin-integration-test) as is, to isolate problems before testing with updated projects. But then you can ultimately update all the test projects to their latest online version, via:

```
git submodule update --remote
```
Note that git keeps record of the commit hash of them, so if you wish to persist this "update to the latest version" of the linked repos, you will need to commit. This is encouraged, especially if all added projects perform well:
```
git commit -am "update linked projects"
```
<br>

##Adding a publicly available project to this repo

1. Make sure the project you are going to add is adequately licensed.

2. `git submodule add <GitLink> src/main/resources/test-projects/<ProjName>`. 

    For example -
    ```
    git submodule add git@github.com:allenai/pipeline.git src/main/resources/test-projects/pipeline
    ```
3. `git commit -am "add test project"`

<br>

##Removing a linked project from this repo

TBD (refer to stack overflow or the [git submodules reference doc](https://git-scm.com/docs/git-submodule))

