package com.google.android.gms.fitness.store.listener;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import defpackage.arxc;
import defpackage.bgws;
import defpackage.eihn;
import defpackage.eiig;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DataUpdateListener extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bgws();
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
        eiig.p(z);
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
            if (eihn.a(this.a, dataUpdateListener.a) && eihn.a(this.b, dataUpdateListener.b) && eihn.a(this.c, dataUpdateListener.c) && eihn.a(this.d, dataUpdateListener.d) && eihn.a(this.e, dataUpdateListener.e)) {
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.c(parcel, a);
    }
}
