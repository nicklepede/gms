package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bgdd;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DataSourceChange extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgdd();
    final String a;
    final DataSource b;
    final long c;

    public DataSourceChange(String str, DataSource dataSource, long j) {
        this.a = str;
        this.b = dataSource;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataSourceChange)) {
            return false;
        }
        DataSourceChange dataSourceChange = (DataSourceChange) obj;
        return arwb.b(this.a, dataSourceChange.a) && arwb.b(this.b, dataSourceChange.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("deleteDataSourceId", this.a, arrayList);
        arwa.b("upsertDataSource", this.b, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.q(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}
