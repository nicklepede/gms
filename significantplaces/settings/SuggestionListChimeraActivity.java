package com.google.android.gms.significantplaces.settings;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.R;
import com.google.android.gms.significantplaces.settings.SuggestionListChimeraActivity;
import defpackage.abt;
import defpackage.abv;
import defpackage.acl;
import defpackage.bp;
import defpackage.dciy;
import defpackage.dcko;
import defpackage.dckv;
import defpackage.dckw;
import defpackage.dckx;
import defpackage.dcky;
import defpackage.dcli;
import defpackage.fuuw;
import defpackage.fvaq;
import defpackage.fvbi;
import defpackage.fvcc;
import defpackage.ips;
import defpackage.jqx;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SuggestionListChimeraActivity extends qfp {
    private final fuuw j;

    public SuggestionListChimeraActivity() {
        dckw dckwVar = new dckw(this);
        int i = fvcc.a;
        this.j = new jqx(new fvbi(dcko.class), new dckx(this), dckwVar, new dcky(this));
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = dciy.a;
        dciy.c(this);
        setContentView(R.layout.significant_places_suggestion_list);
        int i2 = ips.a;
        final abv registerForActivityResult = registerForActivityResult(new acl(), new abt() { // from class: dckr
            @Override // defpackage.abt
            public final void jq(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                fvbo.f(activityResult, "result");
                if (activityResult.a == -1) {
                    SuggestionListChimeraActivity suggestionListChimeraActivity = SuggestionListChimeraActivity.this;
                    int i3 = dciy.a;
                    dciy.b(suggestionListChimeraActivity);
                }
            }
        });
        if (bundle == null) {
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.F(R.id.content_frame, new dcli());
            bpVar.a();
        }
        final EditText editText = (EditText) findViewById(R.id.edit_text_enter_address);
        if (editText != null) {
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: dcks
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    if (z) {
                        bp bpVar2 = new bp(SuggestionListChimeraActivity.this.getSupportFragmentManager());
                        bpVar2.F(R.id.content_frame, new dcjy());
                        bpVar2.a();
                    }
                }
            });
        }
        ImageView imageView = (ImageView) findViewById(R.id.place_autocomplete_back_button);
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: dckt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SuggestionListChimeraActivity suggestionListChimeraActivity = SuggestionListChimeraActivity.this;
                    dg g = suggestionListChimeraActivity.getSupportFragmentManager().g(R.id.content_frame);
                    if (g == null || !(g instanceof dcjy)) {
                        int i3 = dciy.a;
                        dciy.b(suggestionListChimeraActivity);
                        return;
                    }
                    EditText editText2 = editText;
                    bp bpVar2 = new bp(suggestionListChimeraActivity.getSupportFragmentManager());
                    bpVar2.F(R.id.content_frame, new dcli());
                    bpVar2.a();
                    editText2.setText("");
                    editText2.clearFocus();
                }
            });
        }
        ((dcko) this.j.a()).a.g(this, new dckv(new fvaq() { // from class: dcku
            @Override // defpackage.fvaq
            public final Object a(Object obj) {
                Intent a;
                dcmm dcmmVar = (dcmm) obj;
                fvbo.f(dcmmVar, "item");
                int i3 = dciy.a;
                dciy.a();
                fhip fhipVar = dcmmVar.d;
                if (fhipVar == null) {
                    fhipVar = fhip.a;
                }
                double d = fhipVar.b;
                fhip fhipVar2 = dcmmVar.d;
                if (fhipVar2 == null) {
                    fhipVar2 = fhip.a;
                }
                SuggestionListChimeraActivity suggestionListChimeraActivity = this;
                abv abvVar = abv.this;
                double d2 = fhipVar2.c;
                String str = dcmmVar.g;
                fvbo.e(str, "getDisplayAddress(...)");
                String str2 = dcmmVar.c;
                fvbo.e(str2, "getPlaceId(...)");
                String str3 = dcmmVar.f;
                fvbo.e(str3, "getDisplayName(...)");
                a = dcje.a(suggestionListChimeraActivity, d, d2, str, str2, str3, 2, null, null);
                abvVar.b(a);
                return fuvs.a;
            }
        }));
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStart() {
        super.onStart();
        int i = dciy.a;
        dciy.d(this);
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStop() {
        int i = dciy.a;
        dciy.e(this);
        super.onStop();
    }
}
