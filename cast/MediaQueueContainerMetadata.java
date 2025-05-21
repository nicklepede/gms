package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amce;
import defpackage.arwb;
import defpackage.arxc;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class MediaQueueContainerMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new amce();
    public int a;
    public String b;
    public List c;
    public List d;
    public double e;

    public MediaQueueContainerMetadata(int i, String str, List list, List list2, double d) {
        this.a = i;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = d;
    }

    public final void a() {
        this.a = 0;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = 0.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQueueContainerMetadata)) {
            return false;
        }
        MediaQueueContainerMetadata mediaQueueContainerMetadata = (MediaQueueContainerMetadata) obj;
        return this.a == mediaQueueContainerMetadata.a && TextUtils.equals(this.b, mediaQueueContainerMetadata.b) && arwb.b(this.c, mediaQueueContainerMetadata.c) && arwb.b(this.d, mediaQueueContainerMetadata.d) && this.e == mediaQueueContainerMetadata.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, Double.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, this.a);
        arxc.v(parcel, 3, this.b, false);
        List list = this.c;
        arxc.y(parcel, 4, list == null ? null : DesugarCollections.unmodifiableList(list), false);
        List list2 = this.d;
        arxc.y(parcel, 5, list2 != null ? DesugarCollections.unmodifiableList(list2) : null, false);
        arxc.j(parcel, 6, this.e);
        arxc.c(parcel, a);
    }

    public MediaQueueContainerMetadata(MediaQueueContainerMetadata mediaQueueContainerMetadata) {
        this.a = mediaQueueContainerMetadata.a;
        this.b = mediaQueueContainerMetadata.b;
        this.c = mediaQueueContainerMetadata.c;
        this.d = mediaQueueContainerMetadata.d;
        this.e = mediaQueueContainerMetadata.e;
    }

    public MediaQueueContainerMetadata() {
        a();
    }
}
