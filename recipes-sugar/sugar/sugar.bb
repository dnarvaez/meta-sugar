DESCRIPTION = "Sugar Learning Platform"
HOMEPAGE = "http://sugarlabs.org/"
BUGTRACKER = "http://bugs.sugarlabs.org/"

SRC_URI = "http://download.sugarlabs.org/sources/sucrose/glucose/sugar/sugar-0.100.2.tar.xz"
SRC_URI[md5sum] = "4470f5d5894bc238a0bad75c3305beaa"
SRC_URI[sha256sum] = "29b4435e43834625b1783107dedb1faa6d93d22bca84cd2717b8b04be5b629ea"

DEPENDS = "sugar-toolkit-gtk3"

LICENSE = "GPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

inherit autotools
