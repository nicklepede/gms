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
import defpackage.dkyw;
import defpackage.dkyx;
import defpackage.dkyz;
import defpackage.dkzc;
import defpackage.dkzd;
import defpackage.dkzg;
import defpackage.dkzh;
import defpackage.elgo;
import defpackage.fwam;
import j$.time.Duration;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class e implements ImageLoader.ImageListener {
    final /* synthetic */ Set a;
    final /* synthetic */ dkzg b;
    final /* synthetic */ Map c;
    final /* synthetic */ f d;
    final /* synthetic */ dkyx e;

    public e(f fVar, Set set, dkzg dkzgVar, Map map, dkyx dkyxVar) {
        this.a = set;
        this.b = dkzgVar;
        this.c = map;
        this.e = dkyxVar;
        this.d = fVar;
    }

    private final void a(dkzg dkzgVar, int i, int i2, Bitmap bitmap) {
        com.google.android.gms.wallet.dynamite.logging.a aVar = this.d.b;
        String str = dkzgVar.a;
        com.google.android.gms.wallet.dynamite.logging.c.a(aVar, dkzgVar.b, i2, str);
        if (bitmap == null) {
            bitmap = null;
        }
        Map map = this.c;
        map.put(str, new dkzh(i, bitmap));
        dkyz dkyzVar = this.e.a.e;
        if (dkyzVar != null) {
            if (fwam.d() || fwam.c()) {
                if (!fwam.h()) {
                    if (map.isEmpty()) {
                        dkzd dkzdVar = (dkzd) dkyzVar;
                        dkzdVar.d();
                        dkzdVar.b().f(dkzdVar.g(), 6, "Image Responses unavailable after requesting network images");
                        return;
                    }
                    dkzd dkzdVar2 = (dkzd) dkyzVar;
                    int i3 = dkzdVar2.b().f;
                    GetInstrumentAvailabilityResponse getInstrumentAvailabilityResponse = dkzdVar2.b().g;
                    if (getInstrumentAvailabilityResponse == null) {
                        dkzdVar2.d();
                        dkzdVar2.b().f(dkzdVar2.g(), 6, "Cached getCachedGetInstrumentAvailabilityResponse was lost after requesting network images");
                        return;
                    }
                    elgo j = dkzd.j(i3, getInstrumentAvailabilityResponse);
                    if (j.isEmpty()) {
                        dkzdVar2.d();
                        dkzdVar2.b().f(dkzdVar2.g(), 7, "ValueProps changed after requesting network images");
                        return;
                    }
                    dkyw a = dkzdVar2.a();
                    if (a == null) {
                        dkzdVar2.b().f(6, 1, "PayButtonDynamicView unavailable after requesting network images");
                        return;
                    } else {
                        a.f(getInstrumentAvailabilityResponse, dkzd.i((dkzh) map.get(getInstrumentAvailabilityResponse.d)), dkzd.i((dkzh) map.get(getInstrumentAvailabilityResponse.f)), dkzd.i((dkzh) map.get(getInstrumentAvailabilityResponse.h)), j);
                        dkzdVar2.b().e(dkzdVar2.g(), 4);
                        return;
                    }
                }
                dkzd dkzdVar3 = (dkzd) dkyzVar;
                GetInstrumentAvailabilityResponse getInstrumentAvailabilityResponse2 = dkzdVar3.b().g;
                dkzc c = dkzdVar3.c();
                if (getInstrumentAvailabilityResponse2 == null) {
                    dkzdVar3.d();
                    dkzdVar3.b().f(dkzdVar3.g(), 6, "Cached getCachedGetInstrumentAvailabilityResponse was lost after requesting network images");
                    return;
                }
                if (c != null) {
                    Bitmap i4 = dkzd.i((dkzh) map.get(getInstrumentAvailabilityResponse2.d));
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
                        String string = c.getContext().getResources().getString(R.string.dynamic_content_description, c.getContext().getString(dkzc.a(i5)), dkzc.b(str2));
                        c.g(str2);
                        if (!fwam.d() || i4 == null) {
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
                        if (fwam.g()) {
                            c.setContentDescription(string);
                        } else {
                            linearLayout3.setContentDescription(string);
                        }
                    }
                    if (!fwam.e()) {
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
        dkzg dkzgVar = this.b;
        sb.append(dkzgVar.a);
        sb.append(" ");
        sb.append(message);
        Log.e("NetworkImageLoader", sb.toString());
        a(dkzgVar, 13, 3, null);
    }

    @Override // com.android.volley.toolbox.ImageLoader.ImageListener
    public final void onResponse(ImageLoader.ImageContainer imageContainer, boolean z) {
        if (z && imageContainer.getBitmap() == null) {
            return;
        }
        Set set = this.a;
        dkzg dkzgVar = this.b;
        String str = dkzgVar.a;
        if (set.contains(str)) {
            set.remove(str);
            a(dkzgVar, 0, 2, imageContainer.getBitmap());
        }
    }
}
