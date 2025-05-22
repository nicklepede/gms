package com.google.android.gms.significantplaces.settings;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.R;
import com.google.android.gms.significantplaces.settings.SuggestionListChimeraActivity;
import defpackage.aby;
import defpackage.aca;
import defpackage.acq;
import defpackage.bp;
import defpackage.dete;
import defpackage.devi;
import defpackage.devp;
import defpackage.devq;
import defpackage.devr;
import defpackage.devs;
import defpackage.dewc;
import defpackage.fxqu;
import defpackage.fxwo;
import defpackage.fxxg;
import defpackage.fxya;
import defpackage.iri;
import defpackage.jxm;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SuggestionListChimeraActivity extends ryt {
    private final fxqu j;

    public SuggestionListChimeraActivity() {
        devq devqVar = new devq(this);
        int i = fxya.a;
        this.j = new jxm(new fxxg(devi.class), new devr(this), devqVar, new devs(this));
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = dete.a;
        dete.c(this);
        setContentView(R.layout.significant_places_suggestion_list);
        int i2 = iri.a;
        final aca registerForActivityResult = registerForActivityResult(new acq(), new aby() { // from class: devl
            @Override // defpackage.aby
            public final void jF(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                fxxm.f(activityResult, "result");
                if (activityResult.a == -1) {
                    SuggestionListChimeraActivity suggestionListChimeraActivity = SuggestionListChimeraActivity.this;
                    int i3 = dete.a;
                    dete.b(suggestionListChimeraActivity);
                }
            }
        });
        if (bundle == null) {
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.F(R.id.suggestions, new dewc());
            bpVar.a();
        }
        final EditText editText = (EditText) findViewById(R.id.edit_text_enter_address);
        if (editText != null) {
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: devm
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    if (z) {
                        bp bpVar2 = new bp(SuggestionListChimeraActivity.this.getSupportFragmentManager());
                        bpVar2.F(R.id.suggestions, new deue());
                        bpVar2.a();
                    }
                }
            });
        }
        ImageView imageView = (ImageView) findViewById(R.id.place_autocomplete_back_button);
        imageView.setVisibility(0);
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: devn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SuggestionListChimeraActivity suggestionListChimeraActivity = SuggestionListChimeraActivity.this;
                    dg g = suggestionListChimeraActivity.getSupportFragmentManager().g(R.id.suggestions);
                    if (g == null || !(g instanceof deue)) {
                        int i3 = dete.a;
                        dete.b(suggestionListChimeraActivity);
                        return;
                    }
                    EditText editText2 = editText;
                    bp bpVar2 = new bp(suggestionListChimeraActivity.getSupportFragmentManager());
                    bpVar2.F(R.id.suggestions, new dewc());
                    bpVar2.a();
                    editText2.setText("");
                    editText2.clearFocus();
                }
            });
        }
        ((devi) this.j.a()).a.g(this, new devp(new fxwo() { // from class: devo
            @Override // defpackage.fxwo
            public final Object a(Object obj) {
                Intent a;
                dexp dexpVar = (dexp) obj;
                fxxm.f(dexpVar, "item");
                int i3 = dete.a;
                dete.a();
                fjym fjymVar = dexpVar.d;
                if (fjymVar == null) {
                    fjymVar = fjym.a;
                }
                double d = fjymVar.b;
                fjym fjymVar2 = dexpVar.d;
                if (fjymVar2 == null) {
                    fjymVar2 = fjym.a;
                }
                SuggestionListChimeraActivity suggestionListChimeraActivity = this;
                aca acaVar = aca.this;
                double d2 = fjymVar2.c;
                String str = dexpVar.g;
                fxxm.e(str, "getDisplayAddress(...)");
                String str2 = dexpVar.c;
                fxxm.e(str2, "getPlaceId(...)");
                String str3 = dexpVar.f;
                fxxm.e(str3, "getDisplayName(...)");
                a = detk.a(suggestionListChimeraActivity, d, d2, str, str2, str3, 2, null, null);
                acaVar.b(a);
                return fxrq.a;
            }
        }));
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStart() {
        super.onStart();
        int i = dete.a;
        dete.d(this);
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStop() {
        int i = dete.a;
        dete.e(this);
        super.onStop();
    }
}
