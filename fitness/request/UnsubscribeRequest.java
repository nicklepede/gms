package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bgiw;
import defpackage.bglv;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class UnsubscribeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bglv();
    public final DataType a;
    public final DataSource b;
    public final bgiw c;

    public UnsubscribeRequest(DataType dataType, DataSource dataSource, bgiw bgiwVar) {
        arwm.c((dataType == null) != (dataSource == null), "Must specify exactly one of dataType and dataSource.");
        this.a = dataType;
        this.b = dataSource;
        this.c = bgiwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnsubscribeRequest)) {
            return false;
        }
        UnsubscribeRequest unsubscribeRequest = (UnsubscribeRequest) obj;
        return arwb.b(this.b, unsubscribeRequest.b) && arwb.b(this.a, unsubscribeRequest.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        DataType dataType = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, dataType, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        bgiw bgiwVar = this.c;
        arxc.D(parcel, 3, bgiwVar == null ? null : bgiwVar.asBinder());
        arxc.c(parcel, a);
    }
}
