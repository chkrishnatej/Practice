JF := None

mkfile_path := $(abspath $(lastword $(MAKEFILE_LIST)))
mkfile_dir := $(dir $(mkfile_path))

TEMPLATE_DIR := $(abspath $(mkfile_dir)JavaTemplate)

PROG_DIR := $(abspath $(mkfile_dir)$(JF))

COMPILE_FILE := $(PROG_DIR)/$(JF).java
OUT_FILE := $(PROG_DIR)/$(JF)

default: compile run clean

compile:
	@javac $(COMPILE_FILE)

run:
	@cd $(PROG_DIR) && java $(JF)

clean:
	@rm $(PROG_DIR)/*.class

export FILE_NAME ?= $(JF)
create:
	@mkdir $(PROG_DIR)
	@cp -a JavaTemplate/. $(PROG_DIR)
	@cd $(PROG_DIR) && envsubst '$${FILE_NAME}' < JavaTemplate.txt > $(JF).java
	@cd $(PROG_DIR) && rm JavaTemplate.txt