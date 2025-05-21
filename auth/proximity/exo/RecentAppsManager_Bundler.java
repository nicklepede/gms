package com.google.android.gms.auth.proximity.exo;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.parcelablewrappers.ParcelableList;
import com.google.android.enterprise.connectedapps.parcelablewrappers.generated.AppWrapper;
import defpackage.a;
import defpackage.ackm;
import defpackage.aczy;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class RecentAppsManager_Bundler implements Bundler {
    public static final Parcelable.Creator CREATOR = new ackm();

    @Override // com.google.android.enterprise.connectedapps.internal.Bundler
    public final Object a(Bundle bundle, String str, BundlerType bundlerType) {
        bundle.setClassLoader(Bundler.class.getClassLoader());
        String str2 = bundlerType.a;
        if ("java.lang.Void".equals(str2)) {
            return null;
        }
        if ("com.google.android.gms.auth.proximity.exo.RecentAppsManager.AppData".equals(str2)) {
            return (RecentAppsManager$AppData) bundle.getParcelable(str);
        }
        if ("java.util.List".equals(str2)) {
            return ((ParcelableList) bundle.getParcelable(str)).a;
        }
        if ("com.google.android.gms.auth.proximity.phonehub.proto.App".equals(str2)) {
            return ((AppWrapper) bundle.getParcelable(str)).a;
        }
        throw new IllegalArgumentException(a.a(str2, "Type ", " cannot be read from Bundle"));
    }

    @Override // com.google.android.enterprise.connectedapps.internal.Bundler
    public final Object b(Parcel parcel, BundlerType bundlerType) {
        String str = bundlerType.a;
        if ("java.lang.Void".equals(str)) {
            return null;
        }
        if ("com.google.android.gms.auth.proximity.exo.RecentAppsManager.AppData".equals(str)) {
            return (RecentAppsManager$AppData) parcel.readParcelable(Bundler.class.getClassLoader());
        }
        if ("java.util.List".equals(str)) {
            return ((ParcelableList) parcel.readParcelable(Bundler.class.getClassLoader())).a;
        }
        if ("com.google.android.gms.auth.proximity.phonehub.proto.App".equals(str)) {
            return ((AppWrapper) parcel.readParcelable(Bundler.class.getClassLoader())).a;
        }
        throw new IllegalArgumentException(a.a(str, "Type ", " cannot be read from Parcel"));
    }

    @Override // com.google.android.enterprise.connectedapps.internal.Bundler
    public final void c(Bundle bundle, String str, Object obj, BundlerType bundlerType) {
        String str2 = bundlerType.a;
        if ("java.lang.Void".equals(str2)) {
            return;
        }
        if ("com.google.android.gms.auth.proximity.exo.RecentAppsManager.AppData".equals(str2)) {
            bundle.putParcelable(str, (RecentAppsManager$AppData) obj);
        } else if ("java.util.List".equals(str2)) {
            bundle.putParcelable(str, new ParcelableList(this, bundlerType, (List) obj));
        } else {
            if (!"com.google.android.gms.auth.proximity.phonehub.proto.App".equals(str2)) {
                throw new IllegalArgumentException(a.a(str2, "Type ", " cannot be written to Bundle"));
            }
            bundle.putParcelable(str, new AppWrapper((aczy) obj));
        }
    }

    @Override // com.google.android.enterprise.connectedapps.internal.Bundler
    public final void d(Parcel parcel, Object obj, BundlerType bundlerType, int i) {
        String str = bundlerType.a;
        if ("java.lang.Void".equals(str)) {
            return;
        }
        if ("com.google.android.gms.auth.proximity.exo.RecentAppsManager.AppData".equals(str)) {
            parcel.writeParcelable((RecentAppsManager$AppData) obj, i);
        } else if ("java.util.List".equals(str)) {
            parcel.writeParcelable(new ParcelableList(this, bundlerType, (List) obj), i);
        } else {
            if (!"com.google.android.gms.auth.proximity.phonehub.proto.App".equals(str)) {
                throw new IllegalArgumentException(a.a(str, "Type ", " cannot be written to Parcel"));
            }
            parcel.writeParcelable(new AppWrapper((aczy) obj), i);
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
        if ("com.google.android.gms.auth.proximity.exo.RecentAppsManager.AppData".equals(str)) {
            return new RecentAppsManager$AppData[i];
        }
        if ("com.google.android.gms.auth.proximity.phonehub.proto.App".equals(str)) {
            return new aczy[i];
        }
        throw new IllegalArgumentException("Cannot create array of type ".concat(String.valueOf(str)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
