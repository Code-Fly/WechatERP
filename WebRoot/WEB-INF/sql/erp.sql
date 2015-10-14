drop table [dbo].[SCM_project] 
CREATE TABLE [dbo].[SCM_project] (
  [sj_id] varchar(24) NOT NULL,
  [project_name] varchar(4000)  NULL,
  [address] varchar(4000) NULL,
  [product_type] varchar(1000)  NULL,
  [project_type] varchar(1000)  NULL,
  [area] varchar(1000) NULL,
  [union_type] varchar(1000)  NULL,
  [bridge_type] varchar(1000) NULL,
  [bridge_span] varchar(1000) NULL,
  [project_nature] varchar(1000) NULL,
  [comment] varchar(4000)  NULL,
  [openid] varchar(48),
  [create_date] datetime NULL,
  [update_date] datetime NULL,
  [status] int NULL,
  PRIMARY KEY CLUSTERED ([sj_id])
)
GO

drop table [dbo].[SCM_project_1] 
CREATE TABLE [dbo].[SCM_project_1] (
  [sj_id] varchar(24) NOT NULL,
  [amount] decimal(12, 2) NOT NULL,
  [order_date] datetime NOT NULL,
  [owner_unit] varchar(1000) NULL,
  [design_school] varchar(1000) NOT NULL,
  [construction_unit] varchar(1000) NULL ,
  [bid_unit] varchar(1000) NULL,
  [leader] varchar(1000) NULL,
  [help_person] varchar(1000) NULL,
  [project_property] varchar(1000) NULL,
  PRIMARY KEY CLUSTERED ([sj_id])
)
GO


drop table [dbo].[SCM_project_2] 
CREATE TABLE [dbo].[SCM_project_2] (
  [id] int IDENTITY(1, 1) NOT NULL,
  [sj_id] varchar(24) NOT NULL,
  [company_nature] varchar(1000) NULL,
  [name] varchar(1000) NULL,
  [company_job] varchar(512) NULL,
  [tel] varchar(24) NULL,
  PRIMARY KEY CLUSTERED ([id])
)
GO

drop table [dbo].[SCM_project_3] 
CREATE TABLE [dbo].[SCM_project_3] (
  [id] int IDENTITY(1, 1) NOT NULL,
  [follow_date] datetime NULL,
  [stage] varchar(1000) NULL,
  [remark] varchar(4000) NULL,
  PRIMARY KEY CLUSTERED ([id])
)
GO