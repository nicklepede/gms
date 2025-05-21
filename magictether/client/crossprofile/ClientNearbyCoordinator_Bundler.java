package com.google.android.gms.magictether.client.crossprofile;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import com.google.android.gms.nearby.presence.PresenceDevice;
import defpackage.a;
import defpackage.cbmw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class ClientNearbyCoordinator_Bundler implements Bundler {
    public static final Parcelable.Creator CREATOR = new cbmw();

    @Override // com.google.android.enterprise.connectedapps.internal.Bundler
    public final Object a(Bundle bundle, String str, BundlerType bundlerType) {
        bundle.setClassLoader(Bundler.class.getClassLoader());
        String str2 = bundlerType.a;
        if ("java.lang.Void".equals(str2)) {
            return null;
        }
        if ("com.google.android.gms.nearby.presence.PresenceDevice".equals(str2)) {
            return (PresenceDevice) bundle.getParcelable(str);
        }
        if ("com.google.android.gms.magictether.client.crossprofile.FeatureState".equals(str2)) {
            return (FeatureState) bundle.getParcelable(str);
        }
        if ("java.lang.@org.jspecify.annotations.Nullable Boolean".equals(str2)) {
            return (Boolean) bundle.getSerializable(str);
        }
        if ("java.lang.Boolean".equals(str2)) {
            return Boolean.valueOf(bundle.getBoolean(str));
        }
        if ("java.lang.String".equals(str2)) {
            return bundle.getString(str);
        }
        if ("com.google.android.gms.nearby.connection.ConnectionOptions".equals(str2)) {
            return (ConnectionOptions) bundle.getParcelable(str);
        }
        if ("byte[]".equals(str2)) {
            return bundle.getByteArray(str);
        }
        if ("com.google.android.gms.common.api.Status".equals(str2)) {
            return (Status) bundle.getParcelable(str);
        }
        if ("java.lang.Long".equals(str2)) {
            return Long.valueOf(bundle.getLong(str));
        }
        if ("long".equals(str2)) {
            return Long.valueOf(bundle.getLong(str));
        }
        if ("boolean".equals(str2)) {
            return Boolean.valueOf(bundle.getBoolean(str));
        }
        if ("com.google.android.gms.nearby.connection.PayloadTransferUpdate".equals(str2)) {
            return (PayloadTransferUpdate) bundle.getParcelable(str);
        }
        throw new IllegalArgumentException(a.a(str2, "Type ", " cannot be read from Bundle"));
    }

    @Override // com.google.android.enterprise.connectedapps.internal.Bundler
    public final Object b(Parcel parcel, BundlerType bundlerType) {
        String str = bundlerType.a;
        if ("java.lang.Void".equals(str)) {
            return null;
        }
        if ("com.google.android.gms.nearby.presence.PresenceDevice".equals(str)) {
            return (PresenceDevice) parcel.readParcelable(Bundler.class.getClassLoader());
        }
        if ("com.google.android.gms.magictether.client.crossprofile.FeatureState".equals(str)) {
            return (FeatureState) parcel.readParcelable(Bundler.class.getClassLoader());
        }
        if ("java.lang.@org.jspecify.annotations.Nullable Boolean".equals(str)) {
            return (Boolean) parcel.readSerializable();
        }
        if ("java.lang.Boolean".equals(str)) {
            return Boolean.valueOf(parcel.readInt() == 1);
        }
        if ("java.lang.String".equals(str)) {
            return parcel.readString();
        }
        if ("com.google.android.gms.nearby.connection.ConnectionOptions".equals(str)) {
            return (ConnectionOptions) parcel.readParcelable(Bundler.class.getClassLoader());
        }
        if ("byte[]".equals(str)) {
            return parcel.createByteArray();
        }
        if ("com.google.android.gms.common.api.Status".equals(str)) {
            return (Status) parcel.readParcelable(Bundler.class.getClassLoader());
        }
        if ("java.lang.Long".equals(str)) {
            return Long.valueOf(parcel.readLong());
        }
        if ("long".equals(str)) {
            return Long.valueOf(parcel.readLong());
        }
        if ("boolean".equals(str)) {
            return Boolean.valueOf(parcel.readInt() == 1);
        }
        if ("com.google.android.gms.nearby.connection.PayloadTransferUpdate".equals(str)) {
            return (PayloadTransferUpdate) parcel.readParcelable(Bundler.class.getClassLoader());
        }
        throw new IllegalArgumentException(a.a(str, "Type ", " cannot be read from Parcel"));
    }

    @Override // com.google.android.enterprise.connectedapps.internal.Bundler
    public final void c(Bundle bundle, String str, Object obj, BundlerType bundlerType) {
        String str2 = bundlerType.a;
        if ("java.lang.Void".equals(str2)) {
            return;
        }
        if ("com.google.android.gms.nearby.presence.PresenceDevice".equals(str2)) {
            bundle.putParcelable(str, (PresenceDevice) obj);
            return;
        }
        if ("com.google.android.gms.magictether.client.crossprofile.FeatureState".equals(str2)) {
            bundle.putParcelable(str, (FeatureState) obj);
            return;
        }
        if ("java.lang.@org.jspecify.annotations.Nullable Boolean".equals(str2)) {
            bundle.putSerializable(str, (Boolean) obj);
            return;
        }
        if ("java.lang.Boolean".equals(str2)) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if ("java.lang.String".equals(str2)) {
            bundle.putString(str, (String) obj);
            return;
        }
        if ("com.google.android.gms.nearby.connection.ConnectionOptions".equals(str2)) {
            bundle.putParcelable(str, (ConnectionOptions) obj);
            return;
        }
        if ("byte[]".equals(str2)) {
            bundle.putByteArray(str, (byte[]) obj);
            return;
        }
        if ("com.google.android.gms.common.api.Status".equals(str2)) {
            bundle.putParcelable(str, (Status) obj);
        } else if ("java.lang.Long".equals(str2)) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else {
            if (!"com.google.android.gms.nearby.connection.PayloadTransferUpdate".equals(str2)) {
                throw new IllegalArgumentException(a.a(str2, "Type ", " cannot be written to Bundle"));
            }
            bundle.putParcelable(str, (PayloadTransferUpdate) obj);
        }
    }

    @Override // com.google.android.enterprise.connectedapps.internal.Bundler
    public final void d(Parcel parcel, Object obj, BundlerType bundlerType, int i) {
        String str = bundlerType.a;
        if ("java.lang.Void".equals(str)) {
            return;
        }
        if ("com.google.android.gms.nearby.presence.PresenceDevice".equals(str)) {
            parcel.writeParcelable((PresenceDevice) obj, i);
            return;
        }
        if ("com.google.android.gms.magictether.client.crossprofile.FeatureState".equals(str)) {
            parcel.writeParcelable((FeatureState) obj, i);
            return;
        }
        if ("java.lang.@org.jspecify.annotations.Nullable Boolean".equals(str)) {
            parcel.writeSerializable((Boolean) obj);
            return;
        }
        if ("java.lang.Boolean".equals(str)) {
            parcel.writeInt(((Boolean) obj).booleanValue() ? 1 : 0);
            return;
        }
        if ("java.lang.String".equals(str)) {
            parcel.writeString((String) obj);
            return;
        }
        if ("com.google.android.gms.nearby.connection.ConnectionOptions".equals(str)) {
            parcel.writeParcelable((ConnectionOptions) obj, i);
            return;
        }
        if ("byte[]".equals(str)) {
            parcel.writeByteArray((byte[]) obj);
            return;
        }
        if ("com.google.android.gms.common.api.Status".equals(str)) {
            parcel.writeParcelable((Status) obj, i);
        } else if ("java.lang.Long".equals(str)) {
            parcel.writeLong(((Long) obj).longValue());
        } else {
            if (!"com.google.android.gms.nearby.connection.PayloadTransferUpdate".equals(str)) {
                throw new IllegalArgumentException(a.a(str, "Type ", " cannot be written to Parcel"));
            }
            parcel.writeParcelable((PayloadTransferUpdate) obj, i);
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
        if ("com.google.android.gms.nearby.presence.PresenceDevice".equals(str)) {
            return new PresenceDevice[i];
        }
        if ("com.google.android.gms.magictether.client.crossprofile.FeatureState".equals(str)) {
            return new FeatureState[i];
        }
        if ("java.lang.@org.jspecify.annotations.Nullable Boolean".equals(str)) {
            return new Boolean[i];
        }
        if ("java.lang.Boolean".equals(str)) {
            return new Boolean[i];
        }
        if ("java.lang.String".equals(str)) {
            return new String[i];
        }
        if ("com.google.android.gms.nearby.connection.ConnectionOptions".equals(str)) {
            return new ConnectionOptions[i];
        }
        if ("com.google.android.gms.common.api.Status".equals(str)) {
            return new Status[i];
        }
        if ("java.lang.Long".equals(str)) {
            return new Long[i];
        }
        if ("com.google.android.gms.nearby.connection.PayloadTransferUpdate".equals(str)) {
            return new PayloadTransferUpdate[i];
        }
        throw new IllegalArgumentException("Cannot create array of type ".concat(String.valueOf(str)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
