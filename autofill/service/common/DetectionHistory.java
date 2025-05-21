package com.google.android.gms.autofill.service.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.afwe;
import defpackage.afwg;
import defpackage.afwh;
import defpackage.asej;
import defpackage.asot;
import defpackage.eitj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class DetectionHistory extends afwe implements Parcelable {
    private final List d;
    public static final asot b = asot.b("DetectionHistory", asej.AUTOFILL);
    public static final Parcelable.Creator CREATOR = new afwg();
    public static final Parcelable.Creator c = new afwh();

    public DetectionHistory() {
        this.d = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.afwe
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final eitj h() {
        return eitj.i(this.d);
    }

    @Override // defpackage.afwe
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final eitj i(int i) {
        return eitj.i(super.i(i));
    }

    public final void m(Collection collection) {
        this.d.addAll(collection);
    }

    public final void n(AbstractDetectionHistory$DetectionResult... abstractDetectionHistory$DetectionResultArr) {
        Collections.addAll(this.d, abstractDetectionHistory$DetectionResultArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.d);
    }

    public DetectionHistory(Collection collection) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        arrayList.addAll(collection);
    }
}
