import boto3

# Create S3 client
s3 = boto3.client('s3')

# List all S3 buckets
response = s3.list_buckets()

print("S3 Buckets in your AWS Account:"\n)

for bucket in response['Buckets']:
    print(bucket['Name'])
    






import boto3
from datetime import datetime, timezone
# Create S3 client
s3 = boto3.resources('s3')
response = s3.list_buckets()





for bucket in response['Buckets']:
    bucket_name = bucket['Name']
    creation_date = bucket'CreationDate']

    age_days = (datetime.now(timezone.utc) - creation_date).days

    if age-days > 730:
      
        s3.delete_bucket(Bucket=bucket_name)
        print(f"deleted empty bucket: {bucket_name}")
   else 
        #delete all objets
        bucket.objects.all().delete()

        #delete allbucket
        s3.delete_bucket(Bucket=bucket.name)
        print(f"deleted bucket having object: {bucket_name}")


