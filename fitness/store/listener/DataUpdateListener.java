package com.google.android.gms.fitness.store.listener;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import defpackage.atzr;
import defpackage.bjbi;
import defpackage.ekus;
import defpackage.ekvl;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DataUpdateListener extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bjbi();
    public final String a;
    public final String b;
    public final DataSource c;
    public final DataType d;
    public final PendingIntent e;

    public DataUpdateListener(String str, String str2, DataSource dataSource, DataType dataType, PendingIntent pendingIntent) {
        boolean z = true;
        if (dataSource == null && dataType == null) {
            z = false;
        }
        ekvl.q(z);
        this.a = str;
        this.b = str2;
        this.c = dataSource;
        this.d = dataType;
        this.e = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DataUpdateListener) {
            DataUpdateListener dataUpdateListener = (DataUpdateListener) obj;
            if (ekus.a(this.a, dataUpdateListener.a) && ekus.a(this.b, dataUpdateListener.b) && ekus.a(this.c, dataUpdateListener.c) && ekus.a(this.d, dataUpdateListener.d) && ekus.a(this.e, dataUpdateListener.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public final String toString() {
        return String.format("DataUpdateListener{accountName=%s, packageName=%s, dataSource=%s, dataType=%s, pendingIntent=%s}", this.a, this.b, this.c, this.d, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.c(parcel, a);
    }
}
