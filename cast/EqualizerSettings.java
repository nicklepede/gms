package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aoci;
import defpackage.aozc;
import defpackage.atzr;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class EqualizerSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aoci();
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
        return aozc.u(this.a, equalizerSettings.a) && aozc.u(this.b, equalizerSettings.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        EqualizerBandSettings equalizerBandSettings = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, equalizerBandSettings, i, false);
        atzr.t(parcel, 3, this.b, i, false);
        atzr.c(parcel, a);
    }
}
