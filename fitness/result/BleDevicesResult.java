package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atau;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.biqm;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes4.dex */
public class BleDevicesResult extends AbstractSafeParcelable implements atau {
    public static final Parcelable.Creator CREATOR = new biqm();
    public final List a;
    public final Status b;

    public BleDevicesResult(List list, Status status) {
        this.a = DesugarCollections.unmodifiableList(list);
        this.b = status;
    }

    public static BleDevicesResult b(Status status) {
        return new BleDevicesResult(Collections.EMPTY_LIST, status);
    }

    @Override // defpackage.atau
    public final Status a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleDevicesResult)) {
            return false;
        }
        BleDevicesResult bleDevicesResult = (BleDevicesResult) obj;
        return this.b.equals(bleDevicesResult.b) && atyq.b(this.a, bleDevicesResult.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("status", this.b, arrayList);
        atyp.b("bleDevices", this.a, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = atzr.a(parcel);
        atzr.y(parcel, 1, list, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }
}
