package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqyf;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bgmc;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DataSourcesResult extends AbstractSafeParcelable implements aqyf {
    public static final Parcelable.Creator CREATOR = new bgmc();
    public final List a;
    public final Status b;

    public DataSourcesResult(List list, Status status) {
        this.a = DesugarCollections.unmodifiableList(list);
        this.b = status;
    }

    public static DataSourcesResult b(Status status) {
        return new DataSourcesResult(Collections.EMPTY_LIST, status);
    }

    @Override // defpackage.aqyf
    public final Status a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DataSourcesResult) {
            DataSourcesResult dataSourcesResult = (DataSourcesResult) obj;
            if (this.b.equals(dataSourcesResult.b) && arwb.b(this.a, dataSourcesResult.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("status", this.b, arrayList);
        arwa.b("dataSources", this.a, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = arxc.a(parcel);
        arxc.y(parcel, 1, list, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }
}
