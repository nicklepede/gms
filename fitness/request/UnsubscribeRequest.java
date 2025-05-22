package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.binm;
import defpackage.biql;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class UnsubscribeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new biql();
    public final DataType a;
    public final DataSource b;
    public final binm c;

    public UnsubscribeRequest(DataType dataType, DataSource dataSource, binm binmVar) {
        atzb.c((dataType == null) != (dataSource == null), "Must specify exactly one of dataType and dataSource.");
        this.a = dataType;
        this.b = dataSource;
        this.c = binmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnsubscribeRequest)) {
            return false;
        }
        UnsubscribeRequest unsubscribeRequest = (UnsubscribeRequest) obj;
        return atyq.b(this.b, unsubscribeRequest.b) && atyq.b(this.a, unsubscribeRequest.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        DataType dataType = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, dataType, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        binm binmVar = this.c;
        atzr.D(parcel, 3, binmVar == null ? null : binmVar.asBinder());
        atzr.c(parcel, a);
    }
}
