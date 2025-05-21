package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amax;
import defpackage.amxr;
import defpackage.arxc;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class EqualizerSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new amax();
    public final EqualizerBandSettings a;
    public final EqualizerBandSettings b;

    public EqualizerSettings(EqualizerBandSettings equalizerBandSettings, EqualizerBandSettings equalizerBandSettings2) {
        this.a = equalizerBandSettings;
        this.b = equalizerBandSettings2;
    }

    public final JSONObject a() {
        EqualizerBandSettings equalizerBandSettings;
        JSONObject jSONObject = new JSONObject();
        EqualizerBandSettings equalizerBandSettings2 = this.a;
        if (equalizerBandSettings2 != null && (equalizerBandSettings = this.b) != null) {
            try {
                jSONObject.put("low_shelf", equalizerBandSettings2.b());
                jSONObject.put("high_shelf", equalizerBandSettings.b());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EqualizerSettings)) {
            return false;
        }
        EqualizerSettings equalizerSettings = (EqualizerSettings) obj;
        return amxr.u(this.a, equalizerSettings.a) && amxr.u(this.b, equalizerSettings.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        EqualizerBandSettings equalizerBandSettings = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 2, equalizerBandSettings, i, false);
        arxc.t(parcel, 3, this.b, i, false);
        arxc.c(parcel, a);
    }
}
