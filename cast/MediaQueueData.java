package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aodq;
import defpackage.atyq;
import defpackage.atzr;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class MediaQueueData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aodq();
    public String a;
    public String b;
    public int c;
    public String d;
    public MediaQueueContainerMetadata e;
    public int f;
    public List g;
    public int h;
    public long i;
    public boolean j;

    public MediaQueueData(MediaQueueData mediaQueueData) {
        this.a = mediaQueueData.a;
        this.b = mediaQueueData.b;
        this.c = mediaQueueData.c;
        this.d = mediaQueueData.d;
        this.e = mediaQueueData.e;
        this.f = mediaQueueData.f;
        this.g = mediaQueueData.g;
        this.h = mediaQueueData.h;
        this.i = mediaQueueData.i;
        this.j = mediaQueueData.j;
    }

    public final void a() {
        this.a = null;
        this.b = null;
        this.c = 0;
        this.d = null;
        this.f = 0;
        this.g = null;
        this.h = 0;
        this.i = -1L;
        this.j = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQueueData)) {
            return false;
        }
        MediaQueueData mediaQueueData = (MediaQueueData) obj;
        return TextUtils.equals(this.a, mediaQueueData.a) && TextUtils.equals(this.b, mediaQueueData.b) && this.c == mediaQueueData.c && TextUtils.equals(this.d, mediaQueueData.d) && atyq.b(this.e, mediaQueueData.e) && this.f == mediaQueueData.f && atyq.b(this.g, mediaQueueData.g) && this.h == mediaQueueData.h && this.i == mediaQueueData.i && this.j == mediaQueueData.j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, this.e, Integer.valueOf(this.f), this.g, Integer.valueOf(this.h), Long.valueOf(this.i), Boolean.valueOf(this.j)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, this.a, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.o(parcel, 4, this.c);
        atzr.v(parcel, 5, this.d, false);
        atzr.t(parcel, 6, this.e, i, false);
        atzr.o(parcel, 7, this.f);
        List list = this.g;
        atzr.y(parcel, 8, list == null ? null : DesugarCollections.unmodifiableList(list), false);
        atzr.o(parcel, 9, this.h);
        atzr.q(parcel, 10, this.i);
        atzr.e(parcel, 11, this.j);
        atzr.c(parcel, a);
    }

    public MediaQueueData(String str, String str2, int i, String str3, MediaQueueContainerMetadata mediaQueueContainerMetadata, int i2, List list, int i3, long j, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = mediaQueueContainerMetadata;
        this.f = i2;
        this.g = list;
        this.h = i3;
        this.i = j;
        this.j = z;
    }

    public MediaQueueData() {
        a();
    }
}
