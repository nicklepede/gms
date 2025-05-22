package com.google.android.gms.auth.proximity.phonehub;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.parcelablewrappers.ParcelableArray;
import com.google.android.enterprise.connectedapps.parcelablewrappers.ParcelableList;
import defpackage.a;
import defpackage.aewg;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class NotificationListener_Bundler implements Bundler {
    public static final Parcelable.Creator CREATOR = new aewg();

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
        if ("android.service.notification.StatusBarNotification".equals(str2)) {
            return (StatusBarNotification) bundle.getParcelable(str);
        }
        if ("java.lang.Object[]".equals(str2)) {
            return ((ParcelableArray) bundle.getParcelable(str)).a;
        }
        if ("java.util.List".equals(str2)) {
            return ((ParcelableList) bundle.getParcelable(str)).a;
        }
        if ("android.service.notification.NotificationListenerService.RankingMap".equals(str2)) {
            return (NotificationListenerService.RankingMap) bundle.getParcelable(str);
        }
        if ("int".equals(str2)) {
            return Integer.valueOf(bundle.getInt(str));
        }
        if ("boolean".equals(str2)) {
            return Boolean.valueOf(bundle.getBoolean(str));
        }
        if ("com.google.android.gms.auth.proximity.phonehub.ParcelableRanking".equals(str2)) {
            return (ParcelableRanking) bundle.getParcelable(str);
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
        if ("android.service.notification.StatusBarNotification".equals(str)) {
            return (StatusBarNotification) parcel.readParcelable(Bundler.class.getClassLoader());
        }
        if ("java.lang.Object[]".equals(str)) {
            return ((ParcelableArray) parcel.readParcelable(Bundler.class.getClassLoader())).a;
        }
        if ("java.util.List".equals(str)) {
            return ((ParcelableList) parcel.readParcelable(Bundler.class.getClassLoader())).a;
        }
        if ("android.service.notification.NotificationListenerService.RankingMap".equals(str)) {
            return (NotificationListenerService.RankingMap) parcel.readParcelable(Bundler.class.getClassLoader());
        }
        if ("int".equals(str)) {
            return Integer.valueOf(parcel.readInt());
        }
        if ("boolean".equals(str)) {
            return Boolean.valueOf(parcel.readInt() == 1);
        }
        if ("com.google.android.gms.auth.proximity.phonehub.ParcelableRanking".equals(str)) {
            return (ParcelableRanking) parcel.readParcelable(Bundler.class.getClassLoader());
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
        if ("android.service.notification.StatusBarNotification".equals(str2)) {
            bundle.putParcelable(str, (StatusBarNotification) obj);
            return;
        }
        if ("java.lang.Object[]".equals(str2)) {
            bundle.putParcelable(str, new ParcelableArray(this, bundlerType, (Object[]) obj));
            return;
        }
        if ("java.util.List".equals(str2)) {
            bundle.putParcelable(str, new ParcelableList(this, bundlerType, (List) obj));
        } else if ("android.service.notification.NotificationListenerService.RankingMap".equals(str2)) {
            bundle.putParcelable(str, (NotificationListenerService.RankingMap) obj);
        } else {
            if (!"com.google.android.gms.auth.proximity.phonehub.ParcelableRanking".equals(str2)) {
                throw new IllegalArgumentException(a.a(str2, "Type ", " cannot be written to Bundle"));
            }
            bundle.putParcelable(str, (ParcelableRanking) obj);
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
        if ("android.service.notification.StatusBarNotification".equals(str)) {
            parcel.writeParcelable((StatusBarNotification) obj, i);
            return;
        }
        if ("java.lang.Object[]".equals(str)) {
            parcel.writeParcelable(new ParcelableArray(this, bundlerType, (Object[]) obj), i);
            return;
        }
        if ("java.util.List".equals(str)) {
            parcel.writeParcelable(new ParcelableList(this, bundlerType, (List) obj), i);
        } else if ("android.service.notification.NotificationListenerService.RankingMap".equals(str)) {
            parcel.writeParcelable((NotificationListenerService.RankingMap) obj, i);
        } else {
            if (!"com.google.android.gms.auth.proximity.phonehub.ParcelableRanking".equals(str)) {
                throw new IllegalArgumentException(a.a(str, "Type ", " cannot be written to Parcel"));
            }
            parcel.writeParcelable((ParcelableRanking) obj, i);
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
        if ("android.service.notification.StatusBarNotification".equals(str)) {
            return new StatusBarNotification[i];
        }
        if ("android.service.notification.NotificationListenerService.RankingMap".equals(str)) {
            return new NotificationListenerService.RankingMap[i];
        }
        if ("com.google.android.gms.auth.proximity.phonehub.ParcelableRanking".equals(str)) {
            return new ParcelableRanking[i];
        }
        throw new IllegalArgumentException("Cannot create array of type ".concat(String.valueOf(str)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
