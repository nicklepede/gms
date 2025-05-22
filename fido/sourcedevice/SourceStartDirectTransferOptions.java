package com.google.android.gms.fido.sourcedevice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bepy;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class SourceStartDirectTransferOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bepy();
    public final int a;
    public final boolean b;
    public final List c;
    public boolean d;
    public String e;

    public SourceStartDirectTransferOptions(int i, boolean z, List list, boolean z2, String str) {
        this.a = i;
        this.b = z;
        this.c = list;
        this.d = z2;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.e(parcel, 2, this.b);
        atzr.y(parcel, 3, this.c, false);
        atzr.e(parcel, 4, this.d);
        atzr.v(parcel, 5, this.e, false);
        atzr.c(parcel, a);
    }

    public SourceStartDirectTransferOptions(List list) {
        this.a = 1;
        this.b = true;
        this.c = list;
    }
}
