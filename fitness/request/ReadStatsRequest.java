package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bing;
import defpackage.bipx;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class ReadStatsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bipx();
    public final int a;
    public final List b;
    public final bing c;

    public ReadStatsRequest(IBinder iBinder, List list, int i) {
        bing bingVar;
        if (iBinder == null) {
            bingVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IReadStatsCallback");
            bingVar = queryLocalInterface instanceof bing ? (bing) queryLocalInterface : new bing(iBinder);
        }
        this.c = bingVar;
        this.b = list;
        this.a = i;
    }

    public final String toString() {
        return String.format("ReadStatsRequest", new Object[0]);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, this.c.a);
        atzr.y(parcel, 3, this.b, false);
        atzr.o(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        atzr.c(parcel, a);
    }
}
