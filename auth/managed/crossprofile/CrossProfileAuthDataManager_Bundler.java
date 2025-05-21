package com.google.android.gms.auth.managed.crossprofile;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.UserHandle;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.parcelablewrappers.ParcelableList;
import defpackage.a;
import defpackage.abrd;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class CrossProfileAuthDataManager_Bundler implements Bundler {
    public static final Parcelable.Creator CREATOR = new abrd();

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
        if ("java.util.List".equals(str2)) {
            return ((ParcelableList) bundle.getParcelable(str)).a;
        }
        if ("android.os.UserHandle".equals(str2)) {
            return (UserHandle) bundle.getParcelable(str);
        }
        if ("android.os.@org.jspecify.annotations.Nullable UserHandle".equals(str2)) {
            return (UserHandle) bundle.getParcelable(str);
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
        if ("java.util.List".equals(str)) {
            return ((ParcelableList) parcel.readParcelable(Bundler.class.getClassLoader())).a;
        }
        if ("android.os.UserHandle".equals(str)) {
            return (UserHandle) parcel.readParcelable(Bundler.class.getClassLoader());
        }
        if ("android.os.@org.jspecify.annotations.Nullable UserHandle".equals(str)) {
            return (UserHandle) parcel.readParcelable(Bundler.class.getClassLoader());
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
            return;
        }
        if ("java.util.List".equals(str2)) {
            bundle.putParcelable(str, new ParcelableList(this, bundlerType, (List) obj));
        } else if ("android.os.UserHandle".equals(str2)) {
            bundle.putParcelable(str, (UserHandle) obj);
        } else {
            if (!"android.os.@org.jspecify.annotations.Nullable UserHandle".equals(str2)) {
                throw new IllegalArgumentException(a.a(str2, "Type ", " cannot be written to Bundle"));
            }
            bundle.putParcelable(str, (UserHandle) obj);
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
            return;
        }
        if ("java.util.List".equals(str)) {
            parcel.writeParcelable(new ParcelableList(this, bundlerType, (List) obj), i);
        } else if ("android.os.UserHandle".equals(str)) {
            parcel.writeParcelable((UserHandle) obj, i);
        } else {
            if (!"android.os.@org.jspecify.annotations.Nullable UserHandle".equals(str)) {
                throw new IllegalArgumentException(a.a(str, "Type ", " cannot be written to Parcel"));
            }
            parcel.writeParcelable((UserHandle) obj, i);
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
        if ("android.os.UserHandle".equals(str)) {
            return new UserHandle[i];
        }
        if ("android.os.@org.jspecify.annotations.Nullable UserHandle".equals(str)) {
            return new UserHandle[i];
        }
        throw new IllegalArgumentException("Cannot create array of type ".concat(String.valueOf(str)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
