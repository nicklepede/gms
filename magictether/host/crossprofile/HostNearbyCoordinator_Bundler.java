package com.google.android.gms.magictether.host.crossprofile;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.gms.nearby.presence.PresenceDevice;
import defpackage.a;
import defpackage.cbsn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class HostNearbyCoordinator_Bundler implements Bundler {
    public static final Parcelable.Creator CREATOR = new cbsn();

    @Override // com.google.android.enterprise.connectedapps.internal.Bundler
    public final Object a(Bundle bundle, String str, BundlerType bundlerType) {
        bundle.setClassLoader(Bundler.class.getClassLoader());
        String str2 = bundlerType.a;
        if ("java.lang.Void".equals(str2)) {
            return null;
        }
        if ("java.lang.Boolean".equals(str2)) {
            return Boolean.valueOf(bundle.getBoolean(str));
        }
        if ("java.lang.@org.jspecify.annotations.Nullable Boolean".equals(str2)) {
            return (Boolean) bundle.getSerializable(str);
        }
        if ("com.google.android.gms.nearby.presence.PresenceDevice".equals(str2)) {
            return (PresenceDevice) bundle.getParcelable(str);
        }
        if ("byte[]".equals(str2)) {
            return bundle.getByteArray(str);
        }
        throw new IllegalArgumentException(a.a(str2, "Type ", " cannot be read from Bundle"));
    }

    @Override // com.google.android.enterprise.connectedapps.internal.Bundler
    public final Object b(Parcel parcel, BundlerType bundlerType) {
        String str = bundlerType.a;
        if ("java.lang.Void".equals(str)) {
            return null;
        }
        if ("java.lang.Boolean".equals(str)) {
            return Boolean.valueOf(parcel.readInt() == 1);
        }
        if ("java.lang.@org.jspecify.annotations.Nullable Boolean".equals(str)) {
            return (Boolean) parcel.readSerializable();
        }
        if ("com.google.android.gms.nearby.presence.PresenceDevice".equals(str)) {
            return (PresenceDevice) parcel.readParcelable(Bundler.class.getClassLoader());
        }
        if ("byte[]".equals(str)) {
            return parcel.createByteArray();
        }
        throw new IllegalArgumentException(a.a(str, "Type ", " cannot be read from Parcel"));
    }

    @Override // com.google.android.enterprise.connectedapps.internal.Bundler
    public final void c(Bundle bundle, String str, Object obj, BundlerType bundlerType) {
        String str2 = bundlerType.a;
        if ("java.lang.Void".equals(str2)) {
            return;
        }
        if ("java.lang.Boolean".equals(str2)) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if ("java.lang.@org.jspecify.annotations.Nullable Boolean".equals(str2)) {
            bundle.putSerializable(str, (Boolean) obj);
        } else if ("com.google.android.gms.nearby.presence.PresenceDevice".equals(str2)) {
            bundle.putParcelable(str, (PresenceDevice) obj);
        } else {
            if (!"byte[]".equals(str2)) {
                throw new IllegalArgumentException(a.a(str2, "Type ", " cannot be written to Bundle"));
            }
            bundle.putByteArray(str, (byte[]) obj);
        }
    }

    @Override // com.google.android.enterprise.connectedapps.internal.Bundler
    public final void d(Parcel parcel, Object obj, BundlerType bundlerType, int i) {
        String str = bundlerType.a;
        if ("java.lang.Void".equals(str)) {
            return;
        }
        if ("java.lang.Boolean".equals(str)) {
            parcel.writeInt(((Boolean) obj).booleanValue() ? 1 : 0);
            return;
        }
        if ("java.lang.@org.jspecify.annotations.Nullable Boolean".equals(str)) {
            parcel.writeSerializable((Boolean) obj);
        } else if ("com.google.android.gms.nearby.presence.PresenceDevice".equals(str)) {
            parcel.writeParcelable((PresenceDevice) obj, i);
        } else {
            if (!"byte[]".equals(str)) {
                throw new IllegalArgumentException(a.a(str, "Type ", " cannot be written to Parcel"));
            }
            parcel.writeByteArray((byte[]) obj);
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
        if ("java.lang.Boolean".equals(str)) {
            return new Boolean[i];
        }
        if ("java.lang.@org.jspecify.annotations.Nullable Boolean".equals(str)) {
            return new Boolean[i];
        }
        if ("com.google.android.gms.nearby.presence.PresenceDevice".equals(str)) {
            return new PresenceDevice[i];
        }
        throw new IllegalArgumentException("Cannot create array of type ".concat(String.valueOf(str)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
