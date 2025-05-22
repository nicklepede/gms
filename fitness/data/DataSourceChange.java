package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.biht;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DataSourceChange extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new biht();
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
        return atyq.b(this.a, dataSourceChange.a) && atyq.b(this.b, dataSourceChange.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("deleteDataSourceId", this.a, arrayList);
        atyp.b("upsertDataSource", this.b, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.q(parcel, 3, this.c);
        atzr.c(parcel, a);
    }
}
