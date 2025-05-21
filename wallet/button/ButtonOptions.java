package com.google.android.gms.wallet.button;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.dijg;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class ButtonOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new dijg();
    public int a;
    public int b;
    public int c;
    public String d;

    private ButtonOptions() {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ButtonOptions) {
            ButtonOptions buttonOptions = (ButtonOptions) obj;
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(buttonOptions.a)) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(buttonOptions.b)) && arwb.b(Integer.valueOf(this.c), Integer.valueOf(buttonOptions.c)) && arwb.b(this.d, buttonOptions.d)) {
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.o(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.v(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }

    public ButtonOptions(int i, int i2, int i3, String str) {
        Integer.valueOf(i).getClass();
        this.a = i;
        Integer.valueOf(i2).getClass();
        this.b = i2;
        Integer.valueOf(i3).getClass();
        this.c = i3;
        arwm.s(str);
        this.d = str;
    }
}
