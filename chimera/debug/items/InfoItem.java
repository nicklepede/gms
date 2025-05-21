package com.google.android.gms.chimera.debug.items;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.chimera.debug.items.InfoItem;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aoiw;
import defpackage.arxc;
import defpackage.fuyg;
import defpackage.fvaq;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class InfoItem extends AbstractSafeParcelable implements ReflectedParcelable, Comparable {
    public static final Parcelable.Creator CREATOR = new aoiw();
    public final int a;
    public final String b;
    public final String c;

    public InfoItem(int i, String str, String str2) {
        fvbo.f(str, "key");
        fvbo.f(str2, "value");
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        InfoItem infoItem = (InfoItem) obj;
        fvbo.f(infoItem, "other");
        return fuyg.b(this, infoItem, new fvaq[]{new fvaq() { // from class: aoiu
            @Override // defpackage.fvaq
            public final Object a(Object obj2) {
                InfoItem infoItem2 = (InfoItem) obj2;
                fvbo.f(infoItem2, "it");
                return infoItem2.b;
            }
        }, new fvaq() { // from class: aoiv
            @Override // defpackage.fvaq
            public final Object a(Object obj2) {
                InfoItem infoItem2 = (InfoItem) obj2;
                fvbo.f(infoItem2, "it");
                return infoItem2.c;
            }
        }});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "out");
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InfoItem(String str, String str2) {
        this(1, str, str2);
        fvbo.f(str, "key");
        fvbo.f(str2, "value");
    }
}
