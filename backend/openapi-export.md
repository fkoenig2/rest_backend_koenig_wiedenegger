
openapi	"3.0.1"
info
title	"OpenAPI definition"
version	"v0"
servers
0
url	"http://localhost:8081"
description	"Generated server url"
paths
/api/analysis/{id}
get
tags
0	"analysis-controller"
operationId	"getAnalysisById"
parameters
0
name	"id"
in	"path"
required	true
schema
type	"integer"
format	"int64"
responses
200
description	"OK"
content
*/*
schema	{ "$ref": "#/components/schemas/Analysis" }
put
tags
0	"analysis-controller"
operationId	"updateAnalysis"
parameters
0
name	"id"
in	"path"
required	true
schema
type	"integer"
format	"int64"
requestBody
content
application/json
schema
$ref	"#/components/schemas/Analysis"
required	true
responses
200
description	"OK"
content
*/*
schema	{ "$ref": "#/components/schemas/Analysis" }
delete
tags
0	"analysis-controller"
operationId	"deleteAnalysis"
parameters
0
name	"id"
in	"path"
required	true
schema
type	"integer"
format	"int64"
responses
200
description	"OK"
content
*/*
schema	{ type: "object" }
/api/analysis
get
tags
0	"analysis-controller"
operationId	"getAllAnalysis"
responses
200
description	"OK"
content
*/*
schema	{ type: "array", items: {…} }
post
tags
0	"analysis-controller"
operationId	"createAnalysis"
requestBody
content
application/json
schema
$ref	"#/components/schemas/Analysis"
required	true
responses
200
description	"OK"
content
*/*
schema	{ "$ref": "#/components/schemas/Analysis" }
/api/threshold
get
tags
0	"threshold-controller"
operationId	"getAllThresholds"
responses
200
description	"OK"
content
*/*
schema	{ type: "array", items: {…} }
/api/sample
get
tags
0	"sample-controller"
operationId	"getAllSamples"
responses
200
description	"OK"
content
*/*
schema	{ type: "array", items: {…} }
/api/log
get
tags
0	"log-controller"
operationId	"getAllLogs"
responses
200
description	"OK"
content
*/*
schema	{ type: "array", items: {…} }
/api/boxpos
get
tags
0	"boxpo-controller"
operationId	"getAllBoxPositions"
responses
200
description	"OK"
content
*/*
schema	{ type: "array", items: {…} }
/api/box
get
tags
0	"box-controller"
operationId	"getAllBoxes"
responses
200
description	"OK"
content
*/*
schema	{ type: "array", items: {…} }
components
schemas
Analysis
type	"object"
properties
id
type	"integer"
format	"int64"
pol
type	"number"
nat
type	"number"
kal
type	"number"
an
type	"number"
glu
type	"number"
dry
type	"number"
dateIn
type	"string"
format	"date-time"
dateOut
type	"string"
format	"date-time"
weightMea
type	"number"
weightNrm
type	"number"
weightCur
type	"number"
weightDif
type	"number"
density
type	"number"
lane
type	"integer"
format	"int32"
comment
maxLength	255
minLength	0
type	"string"
dateExported
type	"string"
format	"date-time"
aflags
type	"string"
Threshold
type	"object"
properties
thId
maxLength	10
minLength	0
type	"string"
valueMin
type	"number"
valueMax
type	"number"
dateChanged
type	"string"
format	"date-time"
Sample
type	"object"
properties
id
$ref	"#/components/schemas/SampleId"
name
maxLength	255
minLength	0
type	"string"
weightNet
type	"number"
weightBru
type	"number"
weightTar
type	"number"
quantity
type	"integer"
format	"int32"
distance
type	"number"
dateCrumbled
type	"string"
format	"date-time"
lane
type	"integer"
format	"int32"
comment
maxLength	255
minLength	0
type	"string"
dateExported
type	"string"
format	"date-time"
sflags
type	"string"
SampleId
type	"object"
properties
sid
type	"string"
sstamp
type	"string"
format	"date-time"
Log
type	"object"
properties
id
type	"integer"
format	"int64"
dateCreated
type	"string"
format	"date-time"
level
maxLength	10
minLength	0
type	"string"
info
maxLength	255
minLength	0
type	"string"
a
$ref	"#/components/schemas/Analysis"
dateExported
type	"string"
format	"date-time"
Box
type	"object"
properties
name
maxLength	255
minLength	0
type	"string"
numMax
type	"integer"
format	"int32"
type
type	"integer"
format	"int32"
comment
maxLength	255
minLength	0
type	"string"
dateExported
type	"string"
format	"date-time"
bid
type	"string"
Boxpo
type	"object"
properties
id
$ref	"#/components/schemas/BoxpoId"
b
$ref	"#/components/schemas/Box"
dateExported
type	"string"
format	"date-time"
BoxpoId
required
0	"bposId"
type	"object"
properties
bposId
type	"integer"
format	"int32"
bid
type	"string"