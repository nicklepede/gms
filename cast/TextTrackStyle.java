package com.google.android.gms.cast;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aodx;
import defpackage.aozc;
import defpackage.atzr;
import defpackage.autk;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class TextTrackStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aodx();
    public float a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public String i;
    public int j;
    public int k;
    String l;
    public JSONObject m;

    public TextTrackStyle() {
        this(1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
    }

    public static final int a(String str) {
        if (str != null && str.length() == 9 && str.charAt(0) == '#') {
            try {
                return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    public static final String b(int i) {
        return String.format("#%02X%02X%02X%02X", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Integer.valueOf(Color.alpha(i)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextTrackStyle)) {
            return false;
        }
        TextTrackStyle textTrackStyle = (TextTrackStyle) obj;
        JSONObject jSONObject = this.m;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = textTrackStyle.m;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || autk.b(jSONObject, jSONObject2)) && this.a == textTrackStyle.a && this.b == textTrackStyle.b && this.c == textTrackStyle.c && this.d == textTrackStyle.d && this.e == textTrackStyle.e && this.f == textTrackStyle.f && this.g == textTrackStyle.g && this.h == textTrackStyle.h && aozc.u(this.i, textTrackStyle.i) && this.j == textTrackStyle.j && this.k == textTrackStyle.k;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), this.i, Integer.valueOf(this.j), Integer.valueOf(this.k), String.valueOf(this.m)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.m;
        this.l = jSONObject == null ? null : jSONObject.toString();
        int a = atzr.a(parcel);
        atzr.l(parcel, 2, this.a);
        atzr.o(parcel, 3, this.b);
        atzr.o(parcel, 4, this.c);
        atzr.o(parcel, 5, this.d);
        atzr.o(parcel, 6, this.e);
        atzr.o(parcel, 7, this.f);
        atzr.o(parcel, 8, this.g);
        atzr.o(parcel, 9, this.h);
        atzr.v(parcel, 10, this.i, false);
        atzr.o(parcel, 11, this.j);
        atzr.o(parcel, 12, this.k);
        atzr.v(parcel, 13, this.l, false);
        atzr.c(parcel, a);
    }

    public TextTrackStyle(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str, int i8, int i9, String str2) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = str;
        this.j = i8;
        this.k = i9;
        this.l = str2;
        if (str2 == null) {
            this.m = null;
            return;
        }
        try {
            this.m = new JSONObject(this.l);
        } catch (JSONException unused) {
            this.m = null;
            this.l = null;
        }
    }
}
