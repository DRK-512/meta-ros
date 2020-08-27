# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The dingo_description package"
AUTHOR = "Tony Baltovski <tbaltovski@clearpathrobotics.com>"
ROS_AUTHOR = "Tony Baltovski <tbaltovski@clearpathrobotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "dingo"
ROS_BPN = "dingo_description"

ROS_BUILD_DEPENDS = " \
    robot-state-publisher \
    urdf \
    xacro \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    robot-state-publisher \
    urdf \
    xacro \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    robot-state-publisher \
    urdf \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/clearpath-gbp/dingo-release/archive/release/melodic/dingo_description/0.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/dingo_description"
SRC_URI = "git://github.com/clearpath-gbp/dingo-release;${ROS_BRANCH};protocol=https"
SRCREV = "3d8c61608315837bd96057a8b6476f65ccf50933"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
