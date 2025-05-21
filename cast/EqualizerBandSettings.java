package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amaw;
import defpackage.arxc;
import java.math.BigDecimal;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class EqualizerBandSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new amaw();
    public final float a;
    public final float b;
    public final float c;

    public EqualizerBandSettings(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public static EqualizerBandSettings a(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has("gain_db")) {
            return null;
        }
        try {
            return new EqualizerBandSettings(BigDecimal.valueOf(jSONObject.optDouble("frequency", -1.0d)).floatValue(), BigDecimal.valueOf(jSONObject.optDouble("quality", -1.0d)).floatValue(), BigDecimal.valueOf(jSONObject.getDouble("gain_db")).floatValue());
        } catch (JSONException unused) {
            return null;
        }
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("gain_db", this.c);
            float f = this.a;
            if (f != -1.0f) {
                jSONObject.put("frequency", f);
            }
            float f2 = this.b;
            if (f2 != -1.0f) {
                jSONObject.put("quality", f2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EqualizerBandSettings)) {
            return false;
        }
        EqualizerBandSettings equalizerBandSettings = (EqualizerBandSettings) obj;
        return this.a == equalizerBandSettings.a && this.b == equalizerBandSettings.b && this.c == equalizerBandSettings.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        float f = this.a;
        int a = arxc.a(parcel);
        arxc.l(parcel, 2, f);
        arxc.l(parcel, 3, this.b);
        arxc.l(parcel, 4, this.c);
        arxc.c(parcel, a);
    }
}
