package com.google.android.gms.auth.proximity.exo;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import defpackage.a;
import defpackage.acjq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class PendingIntentCreator_Bundler implements Bundler {
    public static final Parcelable.Creator CREATOR = new acjq();

    @Override // com.google.android.enterprise.connectedapps.internal.Bundler
    public final Object a(Bundle bundle, String str, BundlerType bundlerType) {
        bundle.setClassLoader(Bundler.class.getClassLoader());
        String str2 = bundlerType.a;
        if ("java.lang.Void".equals(str2)) {
            return null;
        }
        if ("android.content.Intent".equals(str2)) {
            return (Intent) bundle.getParcelable(str);
        }
        if ("java.lang.String".equals(str2)) {
            return bundle.getString(str);
        }
        if ("int".equals(str2)) {
            return Integer.valueOf(bundle.getInt(str));
        }
        if ("android.app.PendingIntent".equals(str2)) {
            return (PendingIntent) bundle.getParcelable(str);
        }
        throw new IllegalArgumentException(a.a(str2, "Type ", " cannot be read from Bundle"));
    }

    @Override // com.google.android.enterprise.connectedapps.internal.Bundler
    public final Object b(Parcel parcel, BundlerType bundlerType) {
        String str = bundlerType.a;
        if ("java.lang.Void".equals(str)) {
            return null;
        }
        if ("android.content.Intent".equals(str)) {
            return (Intent) parcel.readParcelable(Bundler.class.getClassLoader());
        }
        if ("java.lang.String".equals(str)) {
            return parcel.readString();
        }
        if ("int".equals(str)) {
            return Integer.valueOf(parcel.readInt());
        }
        if ("android.app.PendingIntent".equals(str)) {
            return (PendingIntent) parcel.readParcelable(Bundler.class.getClassLoader());
        }
        throw new IllegalArgumentException(a.a(str, "Type ", " cannot be read from Parcel"));
    }

    @Override // com.google.android.enterprise.connectedapps.internal.Bundler
    public final void c(Bundle bundle, String str, Object obj, BundlerType bundlerType) {
        String str2 = bundlerType.a;
        if ("java.lang.Void".equals(str2)) {
            return;
        }
        if ("android.content.Intent".equals(str2)) {
            bundle.putParcelable(str, (Intent) obj);
        } else if ("java.lang.String".equals(str2)) {
            bundle.putString(str, (String) obj);
        } else {
            if (!"android.app.PendingIntent".equals(str2)) {
                throw new IllegalArgumentException(a.a(str2, "Type ", " cannot be written to Bundle"));
            }
            bundle.putParcelable(str, (PendingIntent) obj);
        }
    }

    @Override // com.google.android.enterprise.connectedapps.internal.Bundler
    public final void d(Parcel parcel, Object obj, BundlerType bundlerType, int i) {
        String str = bundlerType.a;
        if ("java.lang.Void".equals(str)) {
            return;
        }
        if ("android.content.Intent".equals(str)) {
            parcel.writeParcelable((Intent) obj, i);
        } else if ("java.lang.String".equals(str)) {
            parcel.writeString((String) obj);
        } else {
            if (!"android.app.PendingIntent".equals(str)) {
                throw new IllegalArgumentException(a.a(str, "Type ", " cannot be written to Parcel"));
            }
            parcel.writeParcelable((PendingIntent) obj, i);
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
        if ("android.content.Intent".equals(str)) {
            return new Intent[i];
        }
        if ("java.lang.String".equals(str)) {
            return new String[i];
        }
        if ("android.app.PendingIntent".equals(str)) {
            return new PendingIntent[i];
        }
        throw new IllegalArgumentException("Cannot create array of type ".concat(String.valueOf(str)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
