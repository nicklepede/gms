package com.google.android.gms.ads.internal.mraid;

import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.ads.internal.webview.i;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class b {
    public final i g;

    public b(i iVar) {
        this.g = iVar;
    }

    public final void b(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.g.b("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", f).put("rotation", i5));
        } catch (JSONException e) {
            int i6 = c.a;
            h.h("Error occurred while obtaining screen information.", e);
        }
    }
}
