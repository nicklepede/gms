package com.google.android.gms.auth.proximity.phonehub;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.UserHandle;
import android.service.notification.StatusBarNotification;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.parcelablewrappers.ParcelableGuavaOptional;
import com.google.android.enterprise.connectedapps.parcelablewrappers.generated.AppWrapper;
import defpackage.a;
import defpackage.acte;
import defpackage.aczy;
import defpackage.eiid;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class AppInfoManager_Bundler implements Bundler {
    public static final Parcelable.Creator CREATOR = new acte();

    @Override // com.google.android.enterprise.connectedapps.internal.Bundler
    public final Object a(Bundle bundle, String str, BundlerType bundlerType) {
        bundle.setClassLoader(Bundler.class.getClassLoader());
        String str2 = bundlerType.a;
        if ("java.lang.Void".equals(str2)) {
            return null;
        }
        if ("com.google.android.gms.auth.proximity.phonehub.proto.App".equals(str2)) {
            return ((AppWrapper) bundle.getParcelable(str)).a;
        }
        if ("java.lang.String".equals(str2)) {
            return bundle.getString(str);
        }
        if ("android.os.UserHandle".equals(str2)) {
            return (UserHandle) bundle.getParcelable(str);
        }
        if ("android.service.notification.StatusBarNotification".equals(str2)) {
            return (StatusBarNotification) bundle.getParcelable(str);
        }
        if ("com.google.common.base.Optional".equals(str2)) {
            return ((ParcelableGuavaOptional) bundle.getParcelable(str)).a;
        }
        throw new IllegalArgumentException(a.a(str2, "Type ", " cannot be read from Bundle"));
    }

    @Override // com.google.android.enterprise.connectedapps.internal.Bundler
    public final Object b(Parcel parcel, BundlerType bundlerType) {
        String str = bundlerType.a;
        if ("java.lang.Void".equals(str)) {
            return null;
        }
        if ("com.google.android.gms.auth.proximity.phonehub.proto.App".equals(str)) {
            return ((AppWrapper) parcel.readParcelable(Bundler.class.getClassLoader())).a;
        }
        if ("java.lang.String".equals(str)) {
            return parcel.readString();
        }
        if ("android.os.UserHandle".equals(str)) {
            return (UserHandle) parcel.readParcelable(Bundler.class.getClassLoader());
        }
        if ("android.service.notification.StatusBarNotification".equals(str)) {
            return (StatusBarNotification) parcel.readParcelable(Bundler.class.getClassLoader());
        }
        if ("com.google.common.base.Optional".equals(str)) {
            return ((ParcelableGuavaOptional) parcel.readParcelable(Bundler.class.getClassLoader())).a;
        }
        throw new IllegalArgumentException(a.a(str, "Type ", " cannot be read from Parcel"));
    }

    @Override // com.google.android.enterprise.connectedapps.internal.Bundler
    public final void c(Bundle bundle, String str, Object obj, BundlerType bundlerType) {
        String str2 = bundlerType.a;
        if ("java.lang.Void".equals(str2)) {
            return;
        }
        if ("com.google.android.gms.auth.proximity.phonehub.proto.App".equals(str2)) {
            bundle.putParcelable(str, new AppWrapper((aczy) obj));
            return;
        }
        if ("java.lang.String".equals(str2)) {
            bundle.putString(str, (String) obj);
            return;
        }
        if ("android.os.UserHandle".equals(str2)) {
            bundle.putParcelable(str, (UserHandle) obj);
        } else if ("android.service.notification.StatusBarNotification".equals(str2)) {
            bundle.putParcelable(str, (StatusBarNotification) obj);
        } else {
            if (!"com.google.common.base.Optional".equals(str2)) {
                throw new IllegalArgumentException(a.a(str2, "Type ", " cannot be written to Bundle"));
            }
            bundle.putParcelable(str, new ParcelableGuavaOptional(this, bundlerType, (eiid) obj));
        }
    }

    @Override // com.google.android.enterprise.connectedapps.internal.Bundler
    public final void d(Parcel parcel, Object obj, BundlerType bundlerType, int i) {
        String str = bundlerType.a;
        if ("java.lang.Void".equals(str)) {
            return;
        }
        if ("com.google.android.gms.auth.proximity.phonehub.proto.App".equals(str)) {
            parcel.writeParcelable(new AppWrapper((aczy) obj), i);
            return;
        }
        if ("java.lang.String".equals(str)) {
            parcel.writeString((String) obj);
            return;
        }
        if ("android.os.UserHandle".equals(str)) {
            parcel.writeParcelable((UserHandle) obj, i);
        } else if ("android.service.notification.StatusBarNotification".equals(str)) {
            parcel.writeParcelable((StatusBarNotification) obj, i);
        } else {
            if (!"com.google.common.base.Optional".equals(str)) {
                throw new IllegalArgumentException(a.a(str, "Type ", " cannot be written to Parcel"));
            }
            parcel.writeParcelable(new ParcelableGuavaOptional(this, bundlerType, (eiid) obj), i);
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
        if ("com.google.android.gms.auth.proximity.phonehub.proto.App".equals(str)) {
            return new aczy[i];
        }
        if ("java.lang.String".equals(str)) {
            return new String[i];
        }
        if ("android.os.UserHandle".equals(str)) {
            return new UserHandle[i];
        }
        if ("android.service.notification.StatusBarNotification".equals(str)) {
            return new StatusBarNotification[i];
        }
        throw new IllegalArgumentException("Cannot create array of type ".concat(String.valueOf(str)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
