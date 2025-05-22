package com.google.android.gms.significantplaces.settings;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.R;
import com.google.android.gms.significantplaces.settings.SuggestionListToolbarChimeraActivity;
import defpackage.aby;
import defpackage.aca;
import defpackage.acq;
import defpackage.bp;
import defpackage.dete;
import defpackage.deue;
import defpackage.devi;
import defpackage.dewc;
import defpackage.dewg;
import defpackage.dewh;
import defpackage.dewi;
import defpackage.dewj;
import defpackage.dg;
import defpackage.fxqu;
import defpackage.fxwo;
import defpackage.fxxg;
import defpackage.fxxm;
import defpackage.fxya;
import defpackage.iri;
import defpackage.jxm;
import defpackage.rzk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SuggestionListToolbarChimeraActivity extends rzk {
    private final fxqu j;
    private EditText k;

    public SuggestionListToolbarChimeraActivity() {
        dewh dewhVar = new dewh(this);
        int i = fxya.a;
        this.j = new jxm(new fxxg(devi.class), new dewi(this), dewhVar, new dewj(this));
    }

    @Override // defpackage.rzk, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = dete.a;
        dete.c(this);
        setContentView(R.layout.significant_places_suggestion_list);
        int i2 = iri.a;
        final aca registerForActivityResult = registerForActivityResult(new acq(), new aby() { // from class: dewd
            @Override // defpackage.aby
            public final void jF(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                fxxm.f(activityResult, "result");
                if (activityResult.a == -1) {
                    SuggestionListToolbarChimeraActivity suggestionListToolbarChimeraActivity = SuggestionListToolbarChimeraActivity.this;
                    int i3 = dete.a;
                    dete.b(suggestionListToolbarChimeraActivity);
                }
            }
        });
        if (bundle == null) {
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.F(R.id.suggestions, new dewc());
            bpVar.a();
        }
        EditText editText = (EditText) findViewById(R.id.edit_text_enter_address);
        this.k = editText;
        if (editText == null) {
            fxxm.j("editText");
            editText = null;
        }
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: dewe
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                if (z) {
                    bp bpVar2 = new bp(SuggestionListToolbarChimeraActivity.this.getSupportFragmentManager());
                    bpVar2.F(R.id.suggestions, new deue());
                    bpVar2.a();
                }
            }
        });
        View findViewById = findViewById(R.id.place_autocomplete_search_image);
        fxxm.e(findViewById, "findViewById(...)");
        ((ImageView) findViewById).setVisibility(0);
        ((devi) this.j.a()).a.g(this, new dewg(new fxwo() { // from class: dewf
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
                SuggestionListToolbarChimeraActivity suggestionListToolbarChimeraActivity = this;
                aca acaVar = aca.this;
                double d2 = fjymVar2.c;
                String str = dexpVar.g;
                fxxm.e(str, "getDisplayAddress(...)");
                String str2 = dexpVar.c;
                fxxm.e(str2, "getPlaceId(...)");
                String str3 = dexpVar.f;
                fxxm.e(str3, "getDisplayName(...)");
                a = detk.a(suggestionListToolbarChimeraActivity, d, d2, str, str2, str3, 2, null, null);
                acaVar.b(a);
                return fxrq.a;
            }
        }));
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        fxxm.f(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        dg g = getSupportFragmentManager().g(R.id.suggestions);
        if (g == null || !(g instanceof deue)) {
            int i = dete.a;
            dete.b(this);
            return true;
        }
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.suggestions, new dewc());
        bpVar.a();
        EditText editText = this.k;
        EditText editText2 = null;
        if (editText == null) {
            fxxm.j("editText");
            editText = null;
        }
        editText.setText("");
        EditText editText3 = this.k;
        if (editText3 == null) {
            fxxm.j("editText");
        } else {
            editText2 = editText3;
        }
        editText2.clearFocus();
        return true;
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
