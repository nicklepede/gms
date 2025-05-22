package com.google.android.gms.auth.proximity.phonehub;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.parcelablewrappers.ParcelableImmutableList;
import com.google.android.enterprise.connectedapps.parcelablewrappers.ParcelableList;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import defpackage.a;
import defpackage.aest;
import defpackage.elgo;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class AccountEligibilityManager_Bundler implements Bundler {
    public static final Parcelable.Creator CREATOR = new aest();

    @Override // com.google.android.enterprise.connectedapps.internal.Bundler
    public final Object a(Bundle bundle, String str, BundlerType bundlerType) {
        bundle.setClassLoader(Bundler.class.getClassLoader());
        String str2 = bundlerType.a;
        if ("java.lang.Void".equals(str2)) {
            return null;
        }
        if ("com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice".equals(str2)) {
            return (SyncedCryptauthDevice) bundle.getParcelable(str);
        }
        if ("java.util.List".equals(str2)) {
            return ((ParcelableList) bundle.getParcelable(str)).a;
        }
        if ("com.google.common.collect.ImmutableList".equals(str2)) {
            return ((ParcelableImmutableList) bundle.getParcelable(str)).a;
        }
        if ("boolean".equals(str2)) {
            return Boolean.valueOf(bundle.getBoolean(str));
        }
        throw new IllegalArgumentException(a.a(str2, "Type ", " cannot be read from Bundle"));
    }

    @Override // com.google.android.enterprise.connectedapps.internal.Bundler
    public final Object b(Parcel parcel, BundlerType bundlerType) {
        String str = bundlerType.a;
        if ("java.lang.Void".equals(str)) {
            return null;
        }
        if ("com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice".equals(str)) {
            return (SyncedCryptauthDevice) parcel.readParcelable(Bundler.class.getClassLoader());
        }
        if ("java.util.List".equals(str)) {
            return ((ParcelableList) parcel.readParcelable(Bundler.class.getClassLoader())).a;
        }
        if ("com.google.common.collect.ImmutableList".equals(str)) {
            return ((ParcelableImmutableList) parcel.readParcelable(Bundler.class.getClassLoader())).a;
        }
        if ("boolean".equals(str)) {
            return Boolean.valueOf(parcel.readInt() == 1);
        }
        throw new IllegalArgumentException(a.a(str, "Type ", " cannot be read from Parcel"));
    }

    @Override // com.google.android.enterprise.connectedapps.internal.Bundler
    public final void c(Bundle bundle, String str, Object obj, BundlerType bundlerType) {
        String str2 = bundlerType.a;
        if ("java.lang.Void".equals(str2)) {
            return;
        }
        if ("com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice".equals(str2)) {
            bundle.putParcelable(str, (SyncedCryptauthDevice) obj);
        } else if ("java.util.List".equals(str2)) {
            bundle.putParcelable(str, new ParcelableList(this, bundlerType, (List) obj));
        } else {
            if (!"com.google.common.collect.ImmutableList".equals(str2)) {
                throw new IllegalArgumentException(a.a(str2, "Type ", " cannot be written to Bundle"));
            }
            bundle.putParcelable(str, new ParcelableImmutableList(this, bundlerType, (elgo) obj));
        }
    }

    @Override // com.google.android.enterprise.connectedapps.internal.Bundler
    public final void d(Parcel parcel, Object obj, BundlerType bundlerType, int i) {
        String str = bundlerType.a;
        if ("java.lang.Void".equals(str)) {
            return;
        }
        if ("com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice".equals(str)) {
            parcel.writeParcelable((SyncedCryptauthDevice) obj, i);
        } else if ("java.util.List".equals(str)) {
            parcel.writeParcelable(new ParcelableList(this, bundlerType, (List) obj), i);
        } else {
            if (!"com.google.common.collect.ImmutableList".equals(str)) {
                throw new IllegalArgumentException(a.a(str, "Type ", " cannot be written to Parcel"));
            }
            parcel.writeParcelable(new ParcelableImmutableList(this, bundlerType, (elgo) obj), i);
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
        if ("com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice".equals(str)) {
            return new SyncedCryptauthDevice[i];
        }
        throw new IllegalArgumentException("Cannot create array of type ".concat(String.valueOf(str)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
