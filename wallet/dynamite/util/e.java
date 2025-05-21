package com.google.android.gms.wallet.dynamite.util;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.google.android.gms.R;
import com.google.android.gms.wallet.button.GetInstrumentAvailabilityResponse;
import com.google.android.gms.wallet.dynamite.common.ui.RoundedImageViewWithBorder;
import defpackage.dinl;
import defpackage.dinm;
import defpackage.dino;
import defpackage.dinr;
import defpackage.dins;
import defpackage.dinv;
import defpackage.dinw;
import defpackage.eitj;
import defpackage.ftey;
import j$.time.Duration;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class e implements ImageLoader.ImageListener {
    final /* synthetic */ Set a;
    final /* synthetic */ dinv b;
    final /* synthetic */ Map c;
    final /* synthetic */ f d;
    final /* synthetic */ dinm e;

    public e(f fVar, Set set, dinv dinvVar, Map map, dinm dinmVar) {
        this.a = set;
        this.b = dinvVar;
        this.c = map;
        this.e = dinmVar;
        this.d = fVar;
    }

    private final void a(dinv dinvVar, int i, int i2, Bitmap bitmap) {
        com.google.android.gms.wallet.dynamite.logging.a aVar = this.d.b;
        String str = dinvVar.a;
        com.google.android.gms.wallet.dynamite.logging.c.a(aVar, dinvVar.b, i2, str);
        if (bitmap == null) {
            bitmap = null;
        }
        Map map = this.c;
        map.put(str, new dinw(i, bitmap));
        dino dinoVar = this.e.a.e;
        if (dinoVar != null) {
            if (ftey.d() || ftey.c()) {
                if (!ftey.g()) {
                    if (map.isEmpty()) {
                        dins dinsVar = (dins) dinoVar;
                        dinsVar.d();
                        dinsVar.b().f(dinsVar.g(), 6, "Image Responses unavailable after requesting network images");
                        return;
                    }
                    dins dinsVar2 = (dins) dinoVar;
                    int i3 = dinsVar2.b().f;
                    GetInstrumentAvailabilityResponse getInstrumentAvailabilityResponse = dinsVar2.b().g;
                    if (getInstrumentAvailabilityResponse == null) {
                        dinsVar2.d();
                        dinsVar2.b().f(dinsVar2.g(), 6, "Cached getCachedGetInstrumentAvailabilityResponse was lost after requesting network images");
                        return;
                    }
                    eitj j = dins.j(i3, getInstrumentAvailabilityResponse);
                    if (j.isEmpty()) {
                        dinsVar2.d();
                        dinsVar2.b().f(dinsVar2.g(), 7, "ValueProps changed after requesting network images");
                        return;
                    }
                    dinl a = dinsVar2.a();
                    if (a == null) {
                        dinsVar2.b().f(6, 1, "PayButtonDynamicView unavailable after requesting network images");
                        return;
                    } else {
                        a.f(getInstrumentAvailabilityResponse, dins.i((dinw) map.get(getInstrumentAvailabilityResponse.d)), dins.i((dinw) map.get(getInstrumentAvailabilityResponse.f)), dins.i((dinw) map.get(getInstrumentAvailabilityResponse.h)), j);
                        dinsVar2.b().e(dinsVar2.g(), 4);
                        return;
                    }
                }
                dins dinsVar3 = (dins) dinoVar;
                GetInstrumentAvailabilityResponse getInstrumentAvailabilityResponse2 = dinsVar3.b().g;
                dinr c = dinsVar3.c();
                if (getInstrumentAvailabilityResponse2 == null) {
                    dinsVar3.d();
                    dinsVar3.b().f(dinsVar3.g(), 6, "Cached getCachedGetInstrumentAvailabilityResponse was lost after requesting network images");
                    return;
                }
                if (c != null) {
                    Bitmap i4 = dins.i((dinw) map.get(getInstrumentAvailabilityResponse2.d));
                    View view = c.b;
                    if (view == null) {
                        return;
                    }
                    LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.pay_button_card_info_placeholder);
                    LinearLayout linearLayout2 = (LinearLayout) c.b.findViewById(R.id.pay_button_vp_card_info);
                    String str2 = getInstrumentAvailabilityResponse2.a;
                    int i5 = getInstrumentAvailabilityResponse2.b;
                    View view2 = c.b;
                    if (view2 != null) {
                        LinearLayout linearLayout3 = (LinearLayout) view2.findViewById(R.id.pay_button_vp_card_info);
                        String string = c.getContext().getResources().getString(R.string.dynamic_content_description, c.getContext().getString(dinr.a(i5)), dinr.b(str2));
                        c.g(str2);
                        if (!ftey.d() || i4 == null) {
                            c.e(i5);
                        } else {
                            View view3 = c.b;
                            if (view3 != null) {
                                ((ImageView) view3.findViewById(R.id.pay_button_card_network)).setVisibility(8);
                                RoundedImageViewWithBorder roundedImageViewWithBorder = (RoundedImageViewWithBorder) c.b.findViewById(R.id.pay_button_card_art);
                                roundedImageViewWithBorder.setImageBitmap(i4);
                                roundedImageViewWithBorder.setVisibility(0);
                            }
                        }
                        linearLayout3.setContentDescription(string);
                    }
                    if (!ftey.e()) {
                        c.i();
                        m.a(linearLayout, linearLayout2, 0).start();
                    } else {
                        linearLayout.setVisibility(8);
                        linearLayout2.setVisibility(0);
                        c.c(R.id.pay_button_view_dynamic, R.id.pay_button_logo_dynamic, Duration.ZERO);
                    }
                }
            }
        }
    }

    @Override // com.android.volley.Response.ErrorListener
    public final void onErrorResponse(VolleyError volleyError) {
        String message = volleyError.getMessage();
        StringBuilder sb = new StringBuilder("onErrorResponse + request ");
        dinv dinvVar = this.b;
        sb.append(dinvVar.a);
        sb.append(" ");
        sb.append(message);
        Log.e("NetworkImageLoader", sb.toString());
        a(dinvVar, 13, 3, null);
    }

    @Override // com.android.volley.toolbox.ImageLoader.ImageListener
    public final void onResponse(ImageLoader.ImageContainer imageContainer, boolean z) {
        if (z && imageContainer.getBitmap() == null) {
            return;
        }
        Set set = this.a;
        dinv dinvVar = this.b;
        String str = dinvVar.a;
        if (set.contains(str)) {
            set.remove(str);
            a(dinvVar, 0, 2, imageContainer.getBitmap());
        }
    }
}
