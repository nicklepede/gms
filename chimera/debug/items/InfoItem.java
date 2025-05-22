package com.google.android.gms.chimera.debug.items;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.chimera.debug.items.InfoItem;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqkp;
import defpackage.atzr;
import defpackage.fxue;
import defpackage.fxwo;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class InfoItem extends AbstractSafeParcelable implements ReflectedParcelable, Comparable {
    public static final Parcelable.Creator CREATOR = new aqkp();
    public final int a;
    public final String b;
    public final String c;

    public InfoItem(int i, String str, String str2) {
        fxxm.f(str, "key");
        fxxm.f(str2, "value");
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        InfoItem infoItem = (InfoItem) obj;
        fxxm.f(infoItem, "other");
        return fxue.b(this, infoItem, new fxwo[]{new fxwo() { // from class: aqkn
            @Override // defpackage.fxwo
            public final Object a(Object obj2) {
                InfoItem infoItem2 = (InfoItem) obj2;
                fxxm.f(infoItem2, "it");
                return infoItem2.b;
            }
        }, new fxwo() { // from class: aqko
            @Override // defpackage.fxwo
            public final Object a(Object obj2) {
                InfoItem infoItem2 = (InfoItem) obj2;
                fxxm.f(infoItem2, "it");
                return infoItem2.c;
            }
        }});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "out");
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InfoItem(String str, String str2) {
        this(1, str, str2);
        fxxm.f(str, "key");
        fxxm.f(str2, "value");
    }
}
