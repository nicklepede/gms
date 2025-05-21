package com.google.android.gms.auth.proximity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import defpackage.a;
import defpackage.acft;
import defpackage.feay;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class NearbyCrossProfile_Bundler implements Bundler {
    public static final Parcelable.Creator CREATOR = new acft();

    @Override // com.google.android.enterprise.connectedapps.internal.Bundler
    public final Object a(Bundle bundle, String str, BundlerType bundlerType) {
        bundle.setClassLoader(Bundler.class.getClassLoader());
        String str2 = bundlerType.a;
        if ("java.lang.Void".equals(str2)) {
            return null;
        }
        if ("java.lang.String".equals(str2)) {
            return bundle.getString(str);
        }
        if ("com.google.protobuf.ByteString".equals(str2)) {
            return (feay) bundle.getSerializable(str);
        }
        if ("boolean".equals(str2)) {
            return Boolean.valueOf(bundle.getBoolean(str));
        }
        if ("android.os.ParcelFileDescriptor".equals(str2)) {
            return (ParcelFileDescriptor) bundle.getParcelable(str);
        }
        if ("long".equals(str2)) {
            return Long.valueOf(bundle.getLong(str));
        }
        throw new IllegalArgumentException(a.a(str2, "Type ", " cannot be read from Bundle"));
    }

    @Override // com.google.android.enterprise.connectedapps.internal.Bundler
    public final Object b(Parcel parcel, BundlerType bundlerType) {
        String str = bundlerType.a;
        if ("java.lang.Void".equals(str)) {
            return null;
        }
        if ("java.lang.String".equals(str)) {
            return parcel.readString();
        }
        if ("com.google.protobuf.ByteString".equals(str)) {
            return (feay) parcel.readSerializable();
        }
        if ("boolean".equals(str)) {
            return Boolean.valueOf(parcel.readInt() == 1);
        }
        if ("android.os.ParcelFileDescriptor".equals(str)) {
            return (ParcelFileDescriptor) parcel.readParcelable(Bundler.class.getClassLoader());
        }
        if ("long".equals(str)) {
            return Long.valueOf(parcel.readLong());
        }
        throw new IllegalArgumentException(a.a(str, "Type ", " cannot be read from Parcel"));
    }

    @Override // com.google.android.enterprise.connectedapps.internal.Bundler
    public final void c(Bundle bundle, String str, Object obj, BundlerType bundlerType) {
        String str2 = bundlerType.a;
        if ("java.lang.Void".equals(str2)) {
            return;
        }
        if ("java.lang.String".equals(str2)) {
            bundle.putString(str, (String) obj);
        } else if ("com.google.protobuf.ByteString".equals(str2)) {
            bundle.putSerializable(str, (feay) obj);
        } else {
            if (!"android.os.ParcelFileDescriptor".equals(str2)) {
                throw new IllegalArgumentException(a.a(str2, "Type ", " cannot be written to Bundle"));
            }
            bundle.putParcelable(str, (ParcelFileDescriptor) obj);
        }
    }

    @Override // com.google.android.enterprise.connectedapps.internal.Bundler
    public final void d(Parcel parcel, Object obj, BundlerType bundlerType, int i) {
        String str = bundlerType.a;
        if ("java.lang.Void".equals(str)) {
            return;
        }
        if ("java.lang.String".equals(str)) {
            parcel.writeString((String) obj);
        } else if ("com.google.protobuf.ByteString".equals(str)) {
            parcel.writeSerializable((feay) obj);
        } else {
            if (!"android.os.ParcelFileDescriptor".equals(str)) {
                throw new IllegalArgumentException(a.a(str, "Type ", " cannot be written to Parcel"));
            }
            parcel.writeParcelable((ParcelFileDescriptor) obj, i);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.enterprise.connectedapps.internal.Bundler
    public final Object[] e(BundlerType bundlerType, int i) {
        String str = bundlerType.a;
        if ("java.lang.Void".equals(str)) {
            return new Void[i];
        }
        if ("java.lang.String".equals(str)) {
            return new String[i];
        }
        if ("com.google.protobuf.ByteString".equals(str)) {
            return new feay[i];
        }
        if ("android.os.ParcelFileDescriptor".equals(str)) {
            return new ParcelFileDescriptor[i];
        }
        throw new IllegalArgumentException("Cannot create array of type ".concat(String.valueOf(str)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
