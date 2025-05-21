package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqyf;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bglw;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes4.dex */
public class BleDevicesResult extends AbstractSafeParcelable implements aqyf {
    public static final Parcelable.Creator CREATOR = new bglw();
    public final List a;
    public final Status b;

    public BleDevicesResult(List list, Status status) {
        this.a = DesugarCollections.unmodifiableList(list);
        this.b = status;
    }

    public static BleDevicesResult b(Status status) {
        return new BleDevicesResult(Collections.EMPTY_LIST, status);
    }

    @Override // defpackage.aqyf
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
        return this.b.equals(bleDevicesResult.b) && arwb.b(this.a, bleDevicesResult.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("status", this.b, arrayList);
        arwa.b("bleDevices", this.a, arrayList);
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
