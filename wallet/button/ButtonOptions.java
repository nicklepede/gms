package com.google.android.gms.wallet.button;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.dkuq;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class ButtonOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new dkuq();
    public int a;
    public int b;
    public int c;
    public String d;

    private ButtonOptions() {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ButtonOptions) {
            ButtonOptions buttonOptions = (ButtonOptions) obj;
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(buttonOptions.a)) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(buttonOptions.b)) && atyq.b(Integer.valueOf(this.c), Integer.valueOf(buttonOptions.c)) && atyq.b(this.d, buttonOptions.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.o(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.v(parcel, 4, this.d, false);
        atzr.c(parcel, a);
    }

    public ButtonOptions(int i, int i2, int i3, String str) {
        Integer.valueOf(i).getClass();
        this.a = i;
        Integer.valueOf(i2).getClass();
        this.b = i2;
        Integer.valueOf(i3).getClass();
        this.c = i3;
        atzb.s(str);
        this.d = str;
    }
}
