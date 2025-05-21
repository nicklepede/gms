package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bgiq;
import defpackage.bglh;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class ReadStatsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bglh();
    public final int a;
    public final List b;
    public final bgiq c;

    public ReadStatsRequest(IBinder iBinder, List list, int i) {
        bgiq bgiqVar;
        if (iBinder == null) {
            bgiqVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IReadStatsCallback");
            bgiqVar = queryLocalInterface instanceof bgiq ? (bgiq) queryLocalInterface : new bgiq(iBinder);
        }
        this.c = bgiqVar;
        this.b = list;
        this.a = i;
    }

    public final String toString() {
        return String.format("ReadStatsRequest", new Object[0]);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, this.c.a);
        arxc.y(parcel, 3, this.b, false);
        arxc.o(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        arxc.c(parcel, a);
    }
}
