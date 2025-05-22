package com.google.android.gms.autofill.service.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ahwt;
import defpackage.ahwv;
import defpackage.ahww;
import defpackage.auid;
import defpackage.ausn;
import defpackage.elgo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class DetectionHistory extends ahwt implements Parcelable {
    private final List d;
    public static final ausn b = ausn.b("DetectionHistory", auid.AUTOFILL);
    public static final Parcelable.Creator CREATOR = new ahwv();
    public static final Parcelable.Creator c = new ahww();

    public DetectionHistory() {
        this.d = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.ahwt
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final elgo h() {
        return elgo.i(this.d);
    }

    @Override // defpackage.ahwt
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final elgo i(int i) {
        return elgo.i(super.i(i));
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
