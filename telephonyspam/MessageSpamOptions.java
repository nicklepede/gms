package com.google.android.gms.telephonyspam;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dhmw;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class MessageSpamOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhmw();
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.q(parcel, 3, this.c);
        atzr.y(parcel, 4, this.d, false);
        atzr.c(parcel, a);
    }
}
