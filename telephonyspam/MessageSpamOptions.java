package com.google.android.gms.telephonyspam;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dfbq;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class MessageSpamOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dfbq();
    public final int a;
    public final String b;
    public final long c;
    public final List d;

    public MessageSpamOptions(int i, String str, long j, List list) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.q(parcel, 3, this.c);
        arxc.y(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }
}
