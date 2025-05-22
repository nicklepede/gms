package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import defpackage.atzr;
import defpackage.bine;
import defpackage.bipu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class ListSubscriptionsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bipu();
    public final DataType a;
    public final bine b;

    public ListSubscriptionsRequest(DataType dataType, bine bineVar) {
        this.a = dataType;
        this.b = bineVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        bine bineVar = this.b;
        atzr.D(parcel, 2, bineVar == null ? null : bineVar.a);
        atzr.c(parcel, a);
    }

    public ListSubscriptionsRequest(DataType dataType, IBinder iBinder) {
        bine bineVar;
        this.a = dataType;
        if (iBinder == null) {
            bineVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IListSubscriptionsCallback");
            bineVar = queryLocalInterface instanceof bine ? (bine) queryLocalInterface : new bine(iBinder);
        }
        this.b = bineVar;
    }
}
