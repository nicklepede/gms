package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqyf;
import defpackage.arxc;
import defpackage.bgmh;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes4.dex */
public class GoalsResult extends AbstractSafeParcelable implements aqyf {
    public static final Parcelable.Creator CREATOR = new bgmh();
    public final Status a;
    public final List b;

    public GoalsResult(Status status, List list) {
        this.a = status;
        this.b = list;
    }

    public static GoalsResult b(Status status) {
        return new GoalsResult(status, Collections.EMPTY_LIST);
    }

    @Override // defpackage.aqyf
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Status status = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, status, i, false);
        arxc.y(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }
}
